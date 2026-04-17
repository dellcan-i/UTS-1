public class uts1bubble {
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
       
         //bubble sort
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilai[j] < nilai[j+1]) {

                    int tempNilai = nilai[j];
                    nilai[j] = nilai[j+1];
                    nilai[j+1] = tempNilai;

                    String tempNama = nama[j];
                    nama[j] = nama[j+1];
                    nama[j+1] = tempNama;

                    int tempNpm = npm[j];
                    npm[j] = npm[j+1];
                    npm[j+1] = tempNpm;
                }
            }
            System.out.println("Iterasi ke - " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.println(nama[k] + " | " + npm[k] + " | " + nilai[k]);
            }
            System.out.println();
         }
       }
    }

