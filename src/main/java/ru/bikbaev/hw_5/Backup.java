package ru.bikbaev.hw_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class Backup {
    public static void main(String[] args) throws IOException {
        String sourceDirectoryPath = "/Users/arturbikbaev/Desktop/java/Hw/src/main/java/ru/bikbaev";
        String backupDirectoryPath = "/Users/arturbikbaev/Desktop/java/Hw/src/main/java/ru/backup";
        backup(sourceDirectoryPath,backupDirectoryPath);


    }

    public static void backup(String sourceDirectoryPath, String backupDirectoryPath) throws IOException{
        File source = new File(sourceDirectoryPath);
        File backup = new File(backupDirectoryPath);

        if(!backup.exists()){
            backup.mkdirs();
        }

        File[] files = source.listFiles();
        if(files != null){
            for (File file : files){
                if(file.isDirectory()){
                    backup(file.getAbsolutePath(),backupDirectoryPath + "/"+file.getName());
                    System.out.println("Резервная копия директории "+ file.getName()+" создана");
                }
                else {
                    Path sourcePath = file.toPath();
                    Path target = new File(backup,file.getName()).toPath();
                    Files.copy(sourcePath,target,StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Резервная копия файла " + file.getName()+" создано");
                }
            }
        }


    }
}
