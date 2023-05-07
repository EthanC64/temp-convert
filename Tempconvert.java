public class Tempconvert {
    float temp = 0;
    char unit = 'C';

    Tempconvert(float temperature, char type) {
        this.unit = type;
        this.temp = temperature;
    }

    public float convert() {
        float targetTemp = 0;

        if (this.unit == 'C') {
            targetTemp = (this.temp * 9 / 5) + 32;
            this.unit = 'F';
            this.temp = targetTemp;
        } else {
            targetTemp = (this.temp - 32) * 5 / 9;
            this.unit = 'C';
            this.temp = targetTemp;
        }

        return targetTemp;
    }

    public static void main(String[] args) {
        Tempconvert tc = new Tempconvert(25, 'C');

        float test1 = tc.convert();

        float test2 = tc.convert();

        System.out.println(test1 + ", " + test2);
    }
}
