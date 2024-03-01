package pt.ajgr;

public class RecordsMain {

    public static void main(String[] args) {

        PojoDto pojoDto = new PojoDto("André", "Ribeiro", 22, 180);

        System.out.println(pojoDto.getFullName() +" from " + pojoDto.getCountry());

        System.out.println(new ColorRecord(255, 22, 33).getHexString());
    }

    public record ColorRecord(int red, int green, int blue) {

        public ColorRecord {
            if (red > 255 || green > 255 || blue > 255) {
                throw new IllegalArgumentException("Invalid RGB color value");
            }
        }

        public String getHexString() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }
    }
}

