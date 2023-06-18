package zadanie18;


public class Binary {
    private char[] bits;

    public Binary(char[] bits) {
        this.bits = bits.clone();
    }

    public char[] getBits() {
        return bits.clone();
    }

    public void setBits(char[] bits) {
        this.bits = bits.clone();
    }

    public static Binary fromDecimal(int decimal, int length) {
        if (decimal < 0) {
            throw new IllegalArgumentException("Десятичное число не может быть отрицательным");
        }

        char[] bits = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            bits[i] = (char) (decimal % 2 + '0');
            decimal /= 2;
        }

        return new Binary(bits);
    }

    public int toDecimal() {
        int decimal = 0;
        int power = bits.length - 1;

        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == '1') {
                decimal += Math.pow(2, power);
            }
            power--;
        }

        return decimal;
    }

    public static Binary fromString(String binaryString) {
        char[] bits = binaryString.toCharArray();

        // Проверяем, что каждый символ равен '0' или '1'
        for (char bit : bits) {
            if (bit != '0' && bit != '1') {
                throw new IllegalArgumentException("Некорректная строка двоичного числа");
            }
        }

        return new Binary(bits);
    }

    public String toString() {
        return new String(bits);
    }
}
class task18_main {
    public static void main(String[] args) {
        // Пример создания объекта Binary из десятичного числа
        Binary binary1 = Binary.fromDecimal(5, 8);
        System.out.println("Binary1: " + binary1.toString()); // 00000101

        // Пример преобразования Binary в десятичное число
        int decimal1 = binary1.toDecimal();
        System.out.println("Decimal1: " + decimal1); // 5

        // Пример создания объекта Binary из строки
        Binary binary2 = Binary.fromString("101010");
        System.out.println("Binary2: " + binary2.toString()); // 101010

        // Пример преобразования Binary в десятичное число
        int decimal2 = binary2.toDecimal();
        System.out.println("Decimal2: " + decimal2); // 42
    }
}
