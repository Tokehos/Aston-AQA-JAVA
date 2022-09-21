class FigureTest {

    @org.junit.jupiter.api.Test
    void shouldFigureUnderLimit() {
        FigureService service = new FigureService();

        long figure = 8;
        boolean registered = true;

        long actual = service.figure(figure, registered);

    }

    @org.junit.jupiter.api.Test
    void shouldFigureUnderLimit10000() {
        FigureService service = new FigureService();

        long figure = 10000;
        boolean registered = true;

        long actual = service.figure(figure, registered);

    }

    @org.junit.jupiter.api.Test
    void shouldFigureEqualsLimit() {
        FigureService service = new FigureService();

        long figure = 7;
        boolean registered = true;

        long actual = service.figure(figure, registered);

    }

    @org.junit.jupiter.api.Test
    void shouldFigureEqualsNull() {
        FigureService service = new FigureService();

        long figure = 0;
        boolean registered = true;

        long actual = service.figure(figure, registered);

    }

    @org.junit.jupiter.api.Test
    void shouldFigureEqualsMinus() {
        FigureService service = new FigureService();

        long figure = -333;
        boolean registered = true;

        long actual = service.figure(figure, registered);

    }
}