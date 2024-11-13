public class Main {
    public static void main(String[] args) {

        Vector2D vector2Da = new Vector2D(1, 2);
        Vector2D vector2Db = new Vector2D(3, 4);
        Vector2D vector2Dc = new Vector2D(5, 6);

        Vector3DDecorator vectorA = new Vector3DDecorator(vector2Da);
        Vector3DDecorator vectorB = new Vector3DDecorator(vector2Db);
        Vector3DDecorator vectorC = new Vector3DDecorator(vector2Dc);

        Vector3DInheritance vectorD = new Vector3DInheritance(1, 2);
        Vector3DInheritance vectorE = new Vector3DInheritance(3, 4);
        Vector3DInheritance vectorF = new Vector3DInheritance(5, 6);

        System.out.println("UKŁAD KARTEZJAŃSKI:");
        System.out.println("Wektor A: x = " + vectorA.getComponents()[0] + ", y = " + vectorA.getComponents()[1] + ", z = " + vectorA.getComponents()[2]);
        System.out.println("Wektor B: x = " + vectorB.getComponents()[0] + ", y = " + vectorB.getComponents()[1] + ", z = " + vectorB.getComponents()[2]);
        System.out.println("Wektor C: x = " + vectorC.getComponents()[0] + ", y = " + vectorC.getComponents()[1] + ", z = " + vectorC.getComponents()[2]);

        System.out.println("\nUKŁAD BIEGUNOWY Adapter:");
        Polar2DAdapter polarA = new Polar2DAdapter(vector2Da);
        Polar2DAdapter polarB = new Polar2DAdapter(vector2Db);
        Polar2DAdapter polarC = new Polar2DAdapter(vector2Dc);

        System.out.println("Wektor A: promień = " + polarA.abs() + ", kąt = " + polarA.getAngle());
        System.out.println("Wektor B: promień = " + polarB.abs() + ", kąt = " + polarB.getAngle());
        System.out.println("Wektor C: promień = " + polarC.abs() + ", kąt = " + polarC.getAngle());

        System.out.println("\nUKŁAD BIEGUNOWY Dziedizczenie:");
        Vector2DPolarInheritance polarAD = new Vector2DPolarInheritance(1, 2);
        Vector2DPolarInheritance polarBD = new Vector2DPolarInheritance(3, 4);
        Vector2DPolarInheritance polarCD = new Vector2DPolarInheritance(5, 6);

        System.out.println("Wektor A: promień = " + polarAD.abs() + ", kąt = " + polarAD.getAngle());
        System.out.println("Wektor B: promień = " + polarBD.abs() + ", kąt = " + polarBD.getAngle());
        System.out.println("Wektor C: promień = " + polarCD.abs() + ", kąt = " + polarCD.getAngle());

        System.out.println("\nILOCZYN SKALARNY (Dekorator):");
        System.out.println("A . B: " + vectorA.cdot(vectorB));
        System.out.println("A . C: " + vectorA.cdot(vectorC));
        System.out.println("B . C: " + vectorB.cdot(vectorC));

        System.out.println("\nILOCZYN SKALARNY (Dziedziczenie):");
        System.out.println("D . E: " + vectorD.cdot(vectorE));
        System.out.println("D . F: " + vectorD.cdot(vectorF));
        System.out.println("E . F: " + vectorE.cdot(vectorF));

        System.out.println("\nILOCZYN WEKTOROWY (Dekorator):");
        Vector3DDecorator crossAB = vectorA.cross(vectorB);
        System.out.println("A x B: x = " + crossAB.getComponents()[0] + ", y = " + crossAB.getComponents()[1] + ", z = " + crossAB.getComponents()[2]);

        Vector3DDecorator crossBA = vectorB.cross(vectorA);
        System.out.println("B x A: x = " + crossBA.getComponents()[0] + ", y = " + crossBA.getComponents()[1] + ", z = " + crossBA.getComponents()[2]);

        Vector3DDecorator crossAC = vectorA.cross(vectorC);
        System.out.println("A x C: x = " + crossAC.getComponents()[0] + ", y = " + crossAC.getComponents()[1] + ", z = " + crossAC.getComponents()[2]);

        Vector3DDecorator crossCA = vectorC.cross(vectorA);
        System.out.println("C x A: x = " + crossCA.getComponents()[0] + ", y = " + crossCA.getComponents()[1] + ", z = " + crossCA.getComponents()[2]);

        Vector3DDecorator crossBC = vectorB.cross(vectorC);
        System.out.println("B x C: x = " + crossBC.getComponents()[0] + ", y = " + crossBC.getComponents()[1] + ", z = " + crossBC.getComponents()[2]);

        Vector3DDecorator crossCB = vectorC.cross(vectorB);
        System.out.println("C x B: x = " + crossCB.getComponents()[0] + ", y = " + crossCB.getComponents()[1] + ", z = " + crossCB.getComponents()[2]);

        System.out.println("\nILOCZYN WEKTOROWY (Dziedziczenie):");
        Vector3DInheritance crossDE = vectorD.cross(vectorE);
        System.out.println("D x E: x = " + crossDE.getComponents()[0] + ", y = " + crossDE.getComponents()[1] + ", z = " + crossDE.getComponents()[2]);

        Vector3DInheritance crossED = vectorE.cross(vectorD);
        System.out.println("E x D: x = " + crossED.getComponents()[0] + ", y = " + crossED.getComponents()[1] + ", z = " + crossED.getComponents()[2]);

        Vector3DInheritance crossDF = vectorD.cross(vectorF);
        System.out.println("D x F: x = " + crossDF.getComponents()[0] + ", y = " + crossDF.getComponents()[1] + ", z = " + crossDF.getComponents()[2]);

        Vector3DInheritance crossFD = vectorF.cross(vectorD);
        System.out.println("F x D: x = " + crossFD.getComponents()[0] + ", y = " + crossFD.getComponents()[1] + ", z = " + crossFD.getComponents()[2]);

        Vector3DInheritance crossEF = vectorE.cross(vectorF);
        System.out.println("E x F: x = " + crossEF.getComponents()[0] + ", y = " + crossEF.getComponents()[1] + ", z = " + crossEF.getComponents()[2]);

        Vector3DInheritance crossFE = vectorF.cross(vectorE);
        System.out.println("F x E: x = " + crossFE.getComponents()[0] + ", y = " + crossFE.getComponents()[1] + ", z = " + crossFE.getComponents()[2]);

        /*
        Vector3DDecorator vectorG = new Vector3DDecorator(new Vector2D(1, 2),3);

        Vector3DDecorator vectorH = new Vector3DDecorator(new Vector2D(4, 5), 6);

        Vector3DDecorator crossGH = vectorG.cross(vectorH);
        System.out.println("G x H: x = " + crossGH.getComponents()[0] + ", y = " + crossGH.getComponents()[1] + ", z = " + crossGH.getComponents()[2]);

        Vector3DInheritance vectorI = new Vector3DInheritance(1, 2, 3);
        Vector3DInheritance vectorJ = new Vector3DInheritance(4, 5, 6);

        Vector3DInheritance result = vectorI.cross(vectorJ);
        System.out.println(result.getComponents()[0] +
                   ", y = " + result.getComponents()[1] +
                   ", z = " + result.getComponents()[2]);
        */

        Vector2D twoDVectorA = new Vector2D(1, 2);  // Wektor 2D
        Vector2D twoDVectorB = new Vector2D(3, 4);  // Wektor 2D

        Vector3DDecorator threeDVectorA = new Vector3DDecorator(new Polar2DAdapter(twoDVectorA));
        Vector3DDecorator threeDVectorB = new Vector3DDecorator(new Polar2DAdapter(twoDVectorB));

        System.out.println("Wektor A (3D): x = " + threeDVectorA.getComponents()[0] +
                ", y = " + threeDVectorA.getComponents()[1] +
                ", z = " + threeDVectorA.getComponents()[2]);

        System.out.println("Wektor B (3D): x = " + threeDVectorB.getComponents()[0] +
                ", y = " + threeDVectorB.getComponents()[1] +
                ", z = " + threeDVectorB.getComponents()[2]);


    }
}


