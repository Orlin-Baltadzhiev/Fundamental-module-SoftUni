package Songs;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfSongs= Integer.parseInt(scan.nextLine());

        List<Songss> songssList =new ArrayList<>();

        for (int i = 0; i <numberOfSongs ; i++) {
            String[] data = scan.nextLine().split("_");
//
//            String type = data[0];
//            String name = data[1];
//            String time = data[2];

            Songss songss = new Songss(data[0],data[1],data[2]);//
//            songss.setTypeList(type); songss.setName(name); songss.setName(time);
            songssList.add(songss);
        }
        String typeList = scan.nextLine();
        if(typeList.equals("all")){
            for (Songss songss : songssList) {
                System.out.println(songss.getName());
            }
        } else {
            for (Songss songss : songssList) {
                if (songss.getTypeList().equals(typeList)){
                    System.out.println(songss.getName());
                }
                
            }
        }
    }
}
