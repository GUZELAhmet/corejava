public class C07_Delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java her zaman güzeldir");
        System.out.println("sb.delete(8,9) = " + sb.delete(8, 9));//java herzaman güzeldir
        System.out.println("sb.deleteCharAt(8) = " + sb.deleteCharAt(8));//java heraman güzeldir

        int son=sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

        }

    }
}
