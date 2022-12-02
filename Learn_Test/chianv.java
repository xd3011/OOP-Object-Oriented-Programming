class test {
    public static void main(String[] args) {
        usingMathClass();
    }
    static void usingMathClass() {
        int array[] = {0, 0, 0, 0, 0};
        int length = 1;
        int k = 0;
        //Vòng lặp in ra 5 số ngẫu nhiên
        for (int i = 0; i < 100; i++) {
            double randomDouble = Math.random();            
            randomDouble = randomDouble * 5 + 1;
            int randomInt = (int) randomDouble;
            for(int j = 0; j < 5; j++) { 
                if(randomInt == array[j]) {
                    break;
                }
                else {
                    array[j] = randomInt;
                    k = 1;
                }
            }
            if(k == 1) { 
                length++;
            }
            k = 0;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("STT: " + array[i]);
        }
    }
}