package Homework6;


    interface Animal {
        public void makeSomeNoise();
        public void play();
    }
    class Bird implements Animal {
        @Override
        public void makeSomeNoise() {
            System.out.println("The bird says: La la la");
            synk(2);

        }
        @Override
        public void play() {
            System.out.println("The bird plays as:");
            fly();
        }
        public void fly() {
            System.out.println("fly");
        }
        public void synk() {
            System.out.println("synk");
        }
        public void synk(int countOfBirds) {
            for (int i = 0; i < countOfBirds ; i++) {
                System.out.println("synk");
            }

        }


    }
    class Cat implements Animal {
        @Override
        public void makeSomeNoise() {
            System.out.println("The Cat says: Meow");
        }
        @Override
        public void play() {
            System.out.println("The Cat play as: ");
            climp();
        }
        public void climp() {
            System.out.println("climp");
        }
    }
    class Dog implements Animal {
        @Override
        public void makeSomeNoise() {
            System.out.println("The Dog says: Bark bark");
        }
        @Override
        public void play() {
            System.out.println("The Dog plays as: ");
            bringStick();
        }
        public void bringStick(){
            System.out.println("bring a stick");
        }
    }

