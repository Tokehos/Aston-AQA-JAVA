public class FigureService {
    public long figure(long figure, boolean registered) {

        long testFigure = figure;
        long limit = 7;
        if (testFigure > limit) {
            testFigure = limit;

            System.out.println("Привет");
        }
        else {
            System.out.println(testFigure);
        }
        return testFigure;
    }
}

