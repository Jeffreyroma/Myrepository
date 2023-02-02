package Mytaskforitacademy;


public class Task4 {
    public static void main(String[] args){
        byte numb = 1;
        short nums = 23;
        char numc = 'd';
        int numi = 50;
        long numl = 145;
        float numf = 12.5f;
        double numd = 123.5;
        conByte(numb,nums,numc,numi,numl,numf,numd);
        conShort(numb,nums,numc,numi,numl,numf,numd);
        conChar(numb,nums,numc,numi,numl,numf,numd);
        conInt(numb,nums,numc,numi,numl,numf,numd);
        conLong(numb,nums,numc,numi,numl,numf,numd);
        conFloat(numb,nums,numc,numi,numl,numf,numd);
        conDouble(numb,nums,numc,numi,numl,numf,numd);
    }

    public static void conDouble(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("\nImplicit Double type conversion: ");
        double conversion1=numb ;
        double conversion2=nums;
        double conversion3=numc;
        double conversion4=numi;
        double conversion5=numl;
        double conversion6=numf;
        double conversion7=numd;
        System.out.printf("conversion1=%f;\nconversion2=%f;\nconversion3=%f;\nconversion4=%f;\nconversion5=%f;\nconversion6=%f;\nconversion7=%f;\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);
    }

    public static void conFloat(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("\nImplicit Float type conversion: ");
        float conversion1=numb ;
        float conversion2=nums;
        float conversion3=numc;
        float conversion4=numi;
        float conversion5=numl;
        float conversion6=numf;
        double conversion7=numl;
        System.out.printf("conversion1=%f;\nconversion2=%f;\nconversion3=%f;\nconversion4=%f;\nconversion5=%f;\nconversion6=%f;\nconversion7=%f;\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);

        System.out.println("\nExplicit Float type conversion");
        float conversion12= (float) numd;
        System.out.printf("conversion12=%f;\n",conversion12);
    }

    public static void conLong(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("\nImplicit Long type conversion: ");
        long conversion1=numb ;
        long conversion2=nums;
        long conversion3=numc;
        long conversion4=numi;
        long conversion5=numl;
        float conversion6=numl;
        double conversion7=numl;
        System.out.printf("conversion1=%d;\nconversion2=%d;\nconversion3=%d;\nconversion4=%d;\nconversion5=%d;\nconversion6=%f;\nconversion7=%f;\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);

        System.out.println("\nExplicit Long type conversion");
        long conversion11= (long) numf;
        long conversion12= (long) numd;
        System.out.printf("conversion11=%d;\nconversion12=%d;\n",conversion11,conversion12);
    }

    public static void conInt(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("\nImplicit Int type conversion: ");
        int conversion1 =numb;
        int conversion2 =nums;
        int conversion3 =numc;
        int conversion4=numi;
        long conversion5=numi;
        float conversion6=numi;
        double conversion7=numi;
        System.out.printf("conversion1=%d;\nconversion2=%d;\nconversion3=%d;\nconversion4=%d;\nconversion5=%d;\nconversion6=%f;\nconversion7=%f;\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);

        System.out.println("\nExplicit Int type conversion");
        int conversion11= (int) numl;
        int conversion12= (int) numf;
        int conversion13= (int) numd;
        System.out.printf("conversion11=%d;\nconversion12=%d;\nconversion13=%d;\n",conversion11,conversion12,conversion13);

    }

    public static void conChar(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("\nImplicit Char type conversion: ");
        char conversion1= (char) numb;
        char conversion2= (char) nums;
        char conversion3= numc;
        int conversion4=numc;
        long conversion5=numc;
        float conversion6=numc;
        double conversion7=numc;
        System.out.printf("conversion1=%c;\nconversion2=%c;\nconversion3=%c;\nconversion4=%d;\nconversion5=%d;\nconversion6=%f;\nconversion7=%f;\n\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);

        System.out.println("\nExplicit Char type conversion");


        char conversion10= (char) numi;
        char conversion11= (char) numl;
        char conversion12= (char) numf;
        char conversion13= (char) numd;
        System.out.printf("conversion10=%c;\nconversion11=%c;\nconversion12=%c;\nconversion13=%c;\n"
                ,conversion10,conversion11,conversion12,conversion13);
    }

    public static void conShort(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("\nImplicit Short type conversion: ");
        short conversion1 =numb;
        short conversion2=nums;
        char conversion3= (char) nums;
        int conversion4=nums;
        long conversion5=nums;
        float conversion6=nums;
        double conversion7=nums;
        System.out.printf("conversion1=%d;\nconversion2=%d;\nconversion3=%c;\nconversion4=%d;\nconversion5=%d;\nconversion6=%f;\nconversion7=%f;\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);

        System.out.println("\nExplicit Short type conversion");

        short conversion9= (short) numc;
        short conversion10= (short) numi;
        short conversion11= (short) numl;
        short conversion12= (short) numf;
        short conversion13= (short) numd;
        System.out.printf("conversion9=%d;\nconversion10=%c;\nconversion11=%d;\nconversion12=%d;\nconversion13=%d;\n",
                conversion9,conversion10,conversion11,conversion12,conversion13);
    }

    public static void conByte(byte numb, short nums, char numc, int numi, long numl, float numf, double numd) {
        System.out.println("Implicit Byte type conversion: ");
        byte conversion1=numb ;
        short conversion2=numb;
        char conversion3= (char) numb;
        int conversion4=numb;
        long conversion5=numb;
        float conversion6=numb;
        double conversion7=numb;
        System.out.printf("conversion1=%d;\nconversion2=%d;\nconversion3=%c;\nconversion4=%d;\nconversion5=%d;\nconversion6=%f;\nconversion7=%f;\n",
                conversion1,conversion2,conversion3,conversion4,conversion5,conversion6,conversion7);

        System.out.println("\nExplicit Byte type conversion");
        byte conversion8= (byte) nums;
        byte conversion9= (byte) numc;
        byte conversion10= (byte) numi;
        byte conversion11= (byte) numl;
        byte conversion12= (byte) numf;
        byte conversion13= (byte) numd;
        System.out.printf("conversion8=%d;\nconversion9=%d;\nconversion10=%c;\nconversion11=%d;\nconversion12=%d;\nconversion13=%d;\n",
                conversion8,conversion9,conversion10,conversion11,conversion12,conversion13);
    }




}
