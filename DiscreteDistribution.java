public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int[] s = new int[n + 1];
        s[0] = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            s[i + 1] = s[i] + a[i];
        }

        for (int k = 0; k < m; k++) {
            int r = (int) (Math.random() * s[n]);
            int i = 1;
            while (i <= n && !(s[i - 1] <= r && r < s[i])) {
                i++;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}