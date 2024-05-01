import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder strBuilder = new StringBuilder();

    public Main() throws IOException {
    }

    private static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.mkdir()) {
            strBuilder.append("Каталог " + directoryPath + " создан , ");
        } else {
            strBuilder.append("Ошибка при создании каталога: " + directoryPath + " , ");
        }
    }

    private static void createFile(String directoryPath) {
        File fileTxt = new File(directoryPath);
        try {
            if (fileTxt.createNewFile())
                strBuilder.append("Файл " + directoryPath + " создан , ");
        } catch (IOException ex) {
            strBuilder.append(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        createDirectory("C://Java//Games//src");
        createDirectory("C://Java//Games//res");
        createDirectory("C://Java//Games//savegames");
        createDirectory("C://Java//Games//temp");
        createDirectory("C://Java//Games//src//main");
        createDirectory("C://Java//Games//src//test");
        createDirectory("C://Java//Games//res//drawables");
        createDirectory("C://Java//Games//res//vectors");
        createDirectory("C://Java//Games//res//icons");
        createDirectory("C://Java//Games//res//vectors");
        createFile("C://Java//Games//src//main//Main.java");
        createFile("C://Java//Games//src//main//Utils.java");
        createFile("C://Java//Games//temp//temp.txt");
        createFile("C://Java//Games//src//main//Main.java");

        String filePath = "C://Java//Games//temp//temp.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(strBuilder.toString());
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}