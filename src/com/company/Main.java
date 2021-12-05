package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> listPlayer = new ArrayList<>();
        System.out.println("Danh sách cầu thủ là:");
        listPlayer.add(new Player(1, "Trang1", Position.DF));
        listPlayer.add(new Player(2, "Trang2", Position.GK));
        listPlayer.add(new Player(3, "Trang3", Position.MF));
        listPlayer.add(new Player(4, "Trang4", Position.FW));
        listPlayer.add(new Player(5, "Trang5", Position.DF));
        listPlayer.add(new Player(6, "Trang6", Position.GK));
        listPlayer.add(new Player(7, "Trang7", Position.MF));
        listPlayer.add(new Player(8, "Trang8", Position.FW));
        listPlayer.add(new Player(9, "Trang9", Position.FW));
        listPlayer.add(new Player(10, "Trang10", Position.GK));
        listPlayer.add(new Player(11, "Trang11", Position.DF));
        listPlayer.add(new Player(12, "Trang12", Position.MF));
        listPlayer.add(new Player(13, "Trang13", Position.GK));
        listPlayer.add(new Player(14, "Trang14", Position.DF));
        listPlayer.add(new Player(15, "Trang15", Position.FW));
        listPlayer.add(new Player(16, "Trang16", Position.MF));
        listPlayer.add(new Player(17, "Trang17", Position.GK));
        listPlayer.add(new Player(18, "Trang18", Position.DF));
        listPlayer.add(new Player(19, "Trang19", Position.FW));
        listPlayer.add(new Player(20, "Trang20", Position.MF));
        listPlayer.add(new Player(21, "Trang21", Position.GK));
        listPlayer.add(new Player(22, "Trang22", Position.FW));

        printList(listPlayer);

        //Lựa chọn 11 cầu thủ ngẫu nhiên theo mô hình

        ArrayList<Player> selectedTeam = new ArrayList<>();
        Random general = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mô hình đội bạn mong muốn: ");
        System.out.print("Số lượng GK bạn mong muốn là: ");
        int numberOfGK = sc.nextInt();
        System.out.print("Số lượng DF bạn mong muốn là: ");
        int numberOfDF = sc.nextInt();
        System.out.print("Số lượng MF bạn mong muốn là: ");
        int numberOfMF = sc.nextInt();
        System.out.print("Số lượng FW bạn mong muốn là: ");
        int numberOfFW = sc.nextInt();

        System.out.println("Đội hình cầu thủ như bạn mong muốn là:");
        int sizeGK = 0;
        int sizeDF = 0;
        int sizeMF = 0;
        int sizeFW = 0;

        while (sizeGK < numberOfGK) {
            int rdOfGK = general.nextInt(22);
            if (listPlayer.get(rdOfGK).getPosition().equals(Position.GK) && !selectedTeam.contains(listPlayer.get(rdOfGK))) {
                selectedTeam.add(listPlayer.get(rdOfGK));
                sizeGK++;
            }
        }
        while (sizeDF < numberOfDF) {
            int rdOfDF = general.nextInt(22);
            if (listPlayer.get(rdOfDF).getPosition().equals(Position.DF) && !selectedTeam.contains(listPlayer.get(rdOfDF))) {
                selectedTeam.add(listPlayer.get(rdOfDF));
                sizeDF++;
            }
        }
        while (sizeMF < numberOfMF) {
            int rdOfMF = general.nextInt(22);
            if (listPlayer.get(rdOfMF).getPosition().equals(Position.MF) && !selectedTeam.contains(listPlayer.get(rdOfMF))) {
                selectedTeam.add(listPlayer.get(rdOfMF));
                sizeMF++;
            }
        }
        while (sizeFW < numberOfFW) {
            int rdOfFW = general.nextInt(22);
            if (listPlayer.get(rdOfFW).getPosition().equals(Position.FW) && !selectedTeam.contains(listPlayer.get(rdOfFW))) {
                selectedTeam.add(listPlayer.get(rdOfFW));
                sizeFW++;
            }
        }
        printList(selectedTeam);
    }

    public static void printList(ArrayList<Player> list) {
        for (Player str : list) {
            System.out.println(str);
        }
    }
}
