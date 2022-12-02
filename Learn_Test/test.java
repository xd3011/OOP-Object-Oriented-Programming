class test {
    public static void main(String[] args) {
        usingMathClass();
    }
    static void usingMathClass() {
        int a = 0, b = 0;
        int index = 0;
        int array[] = {0, 0, 0, 0, 0, 0};
        //Vòng lặp in ra 5 số ngẫu nhiên
        for (int i = 0; i < 100; i++) {
            double randomDouble = Math.random();            
            randomDouble = randomDouble * 5 + 1;
            double randomDouble2 = Math.random();
            randomDouble2 = randomDouble2 * 5 + 1;
            int randomInt = (int) randomDouble;
            int randomInt2 = (int) randomDouble2;
            if(randomInt != a && randomInt != b && randomInt2 != a && randomInt2 != b && randomInt != randomInt2) {
                System.out.println("Random number is : " + randomInt + " "+ randomInt2);
                a = randomInt;
                b = randomInt2;
                index++;
                if (a == 1 || b == 1) {
                    array[1]++;
                }
                if (a == 2 || b == 2) {
                    array[2]++;
                }
                if (a == 3|| b == 3) {
                    array[3]++;
                }
                if (a == 4|| b == 4) {
                    array[4]++;
                }
                if (a == 5|| b == 5) {
                    array[5]++;
                }
            }
            if(index == 13) {
                break;
            }
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number"+ i + ": " + array[i]);
        }
    }
}