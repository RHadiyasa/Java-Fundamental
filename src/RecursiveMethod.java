public class RecursiveMethod {
    public static void main(String[] args) {

        int number = 8;
        int manualCount = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8;
        int factorial = loopFactorial(number);
        System.out.println(number + " Faktorial (Loop) = " + factorial);
        System.out.println(number + " Faktorial hitung Manual = " + manualCount);
        System.out.println("-".repeat(50));

        int recursiveFactorial = recursiveFactorial(number);
        System.out.println(number + " Faktorial (Recursive) = " + recursiveFactorial);
    }

    // FAKTORIAL MENGGUNAKAN FUNGSI LOOPING BIASA
    static int loopFactorial(int number) {
        // Dimulai dari 1 karena kalau dari 0 hasilnya akan tetap 0
        int resultFactorial = 1;

        for (int i = 1; i <= number; i++) {
            resultFactorial = resultFactorial * i;
        }

        return resultFactorial;
    }

    // RECURSIVE FACTORIAL
    static int recursiveFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }
    }


    // Stack Overflow Error

    /*
    fungsi :
    x() {
    }

    x() {
        x() {
        }
    }

    recursive :
    x() { --> Stack 1
        x() { --> Stack 2
            x() { --> Stack 3 dst.
                x() {
                    x() {
                        x() {
                            x().. -> Jika terlalu banyak, stack yang menumpuk makin banyak
                        }
                    }
                }
            }
        }
    }


    static void fungsi(){ --> Stack 1
        fungsi(){ --> stack 2
            fungsi(){ --> stack 3 dst
                fungsi(){
                    fungsi(){
                        fungsi(){
                            fungsi();
                        };
                    };
                };
            };
        };
    }
     */
}

