import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder();


        File src = new File("C://Java//Games//src");
        if (src.mkdir())
            strBuilder.append("Каталог src создан, ");

        File res = new File("C://Java//Games//res");
        if (res.mkdir())
            strBuilder.append("Каталог res создан, ");

        File savegames = new File("C://Java//Games//savegames, ");
        if (savegames.mkdir())
            strBuilder.append("Каталог savegames создан, ");

        File temp = new File("C://Java//Games//temp");
        if (temp.mkdir())
            strBuilder.append("Каталог temp создан, ");

        File main = new File("C://Java//Games//src//main");
        if (main.mkdir())
            strBuilder.append("Каталог main создан, ");

        File test = new File("C://Java//Games//src//test");
        if (test.mkdir())
            strBuilder.append("Каталог test создан, ");

        File drawables = new File("C://Java//Games//res//drawables");
        if (drawables.mkdir())
            strBuilder.append("Каталог drawables создан, ");

        File vectors = new File("C://Java//Games//res//vectors");
        if (vectors.mkdir())
            strBuilder.append("Каталог vectors создан, ");

        File icons = new File("C://Java//Games//res//icons");
        if (icons.mkdir())
            strBuilder.append("Каталог icons создан, ");


        File myFile = new File("C://Java//Games//src//main//Main.java");
        try {
            if (myFile.createNewFile())
                strBuilder.append("Файл Main.java создан, ");
        } catch (IOException ex) {
            strBuilder.append(ex.getMessage());
        }

        File myFile1 = new File("C://Java//Games//src//main//Utils.java");
        try {
            if (myFile1.createNewFile())
                strBuilder.append("Файл Utils.java создан, ");
        } catch (IOException ex) {
            strBuilder.append(ex.getMessage());
        }
        File myFile2 = new File("C://Java//Games//temp//temp.txt");
        try {
            if (myFile2.createNewFile())
                strBuilder.append("Файл temp.txt создан, ");
        } catch (IOException ex) {
            strBuilder.append(ex.getMessage());
        }

        String filePath = "C://Java//Games//temp//temp.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(strBuilder.toString());
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

    }
}