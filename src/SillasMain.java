public class SillasMain {
    public static void main(String[] args) {
        Sillas.Silla sillaModerna = new Sillas().new SillaModerna();
        sillaModerna.sentarse();

        Sillas.Sofa sofaVictoriano = new Sillas().new SofaVictoriano();
        sofaVictoriano.acostarse();

        Sillas.Mesilla mesillaArtDeco = new Sillas().new MesillaArtDeco();
        mesillaArtDeco.ponerCosas();
    }
}
