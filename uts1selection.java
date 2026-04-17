public class uts1selection {
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
       
         for (int i = 0; i < n; i++) {
            int max = i;

            for (int j = i + 1; j < n; j++) {
                if (nilai[j] > nilai[max]) {
                    max = j;
                }
            }

            int tempNilai = nilai[i];
            nilai[i] = nilai[max];
            nilai[max] = tempNilai;

            String tempNama = nama[i];
            nama[i] = nama[max];
            nama[max] = tempNama;

            int tempNpm = npm[i];
            npm[i] = npm[max];
            npm[max] = tempNpm;

            System.out.println("Iterasi ke - " + (i + 1));
            for (int k = 0; k < n; k++) {
                System.out.println(nama[k] + " | " + npm[k] + " | " + nilai[k]);
            }
            System.out.println();
         }
    }
}
