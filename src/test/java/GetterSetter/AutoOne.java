package GetterSetter;

public class AutoOne {
        public static void main(String[] arg) {
            AutoGruz gruz = new AutoGruz();
            gruz.setNameDriver("Vasya");
            gruz.setNumberAuto("AA0011AA");
            gruz.setWeightGruz(0);
            gruz.print();

        }
    }

    class AutoGruz {
        private String numberAuto;
        private String nameDriver;
        private int weightGruz;

        public void setNumberAuto(String number) {
            numberAuto = number;

        }
        public String getNumberAuto(){
            return numberAuto;
        }
        public void setNameDriver(String driver){
            nameDriver = driver;
        }
        public String getNameDriver(){
            return nameDriver;
        }
        public void setWeightGruz(int kg){
            if (weightGruz<=0  ) {
                System.out.println("enter valid data");
            }
            else   {
                weightGruz = kg;
            }
        }
        //    public int getWeightGruz(){
//        return  weightGruz;
//    }
        void print(){
            System.out.println(nameDriver);
            System.out.println(numberAuto);
            System.out.println(weightGruz);

        }

    }


