public class Sillas {

    interface Silla {
        void sentarse();
    }

    interface Sofa {
        void acostarse();
    }

    interface Mesilla {
        void ponerCosas();
    }
    class SillaModerna implements Silla {
        public void sentarse() {
            System.out.println("Sentarse en la silla moderna");
        }
    }

    class SofaModerno implements Sofa {
        public void acostarse() {
            System.out.println("Acostarse en el sofá moderno.");
        }
    }

    class MesillaModerna implements Mesilla {
        public void ponerCosas() {
            System.out.println("Poner vaso en la mesilla moderna.");
        }
    }
    class SillaVictoriana implements Silla {
        public void sentarse() {
            System.out.println("Sentarse en la silla victoriana.");
        }
    }

    class SofaVictoriano implements Sofa {
        public void acostarse() {
            System.out.println("Acostarse en el sofá victoriano.");
        }
    }

    class MesillaVictoriana implements Mesilla {
        public void ponerCosas() {
            System.out.println("Poner un plato en la mesilla victoriana.");
        }
    }

    class SillaArtDeco implements Silla {
        public void sentarse() {
            System.out.println("Sentarse en la silla art deco.");
        }
    }

    class SofaArtDeco implements Sofa {
        public void acostarse() {
            System.out.println("Acostarse en el sofá art deco.");
        }
    }

    class MesillaArtDeco implements Mesilla {
        public void ponerCosas() {
            System.out.println("Poniendo un pocillo en la mesilla art deco.");
        }
    }
}