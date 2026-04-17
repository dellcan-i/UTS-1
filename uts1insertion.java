public class uts1insertion {
    public static void main(String[] args) {
         String[] nama = {
            "Andi", "Budi", "Citra", "Deni", "Eko",
            "Fajar", "Dina", "Hadi", "Intan", "Riko"
        };

        int[] npm = {
            2501001, 1501002, 2501003, 2501004, 2501005,
            2501006, 2501007, 2501008, 2501009, 2501010
        };

        int[] nilai = {
            85, 70, 95, 80, 65,
            83, 90, 69, 89, 75
        };
         int n = nilai.length;
       
         //insertion sort
         for (int i = 1; i < n; i++) {
            int keyNilai = nilai[i];
            String keyNama = nama[i];
            int keyNpm = npm[i];

            int j = i - 1;

            while (j >= 0 && nilai[j] < keyNilai) {
                nilai[j + 1] = nilai[j];
                nama[j + 1] = nama[j];
                npm[j + 1] = npm[j];
                j--;
            }
            nilai[j + 1] = keyNilai;
            nama[j + 1] = keyNama;
            npm[j + 1] = keyNpm;

            System.out.println("Iterasi ke - " + i);
            for (int k = 0; k < n; k++) {
                System.out.println(nama[k] + " | " + npm[k] + " | " + nilai[k]);
             }
        System.out.println();   
    }
}
}
