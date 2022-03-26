package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	LinkedList<playerlist> playerlists = new LinkedList<playerlist>();

    playerlists.addLast(new playerlist("akad","payung teduh"));
    playerlists.addLast(new playerlist("hati hati dijalan", "tulus"));


    Scanner in = new Scanner(System.in);

    boolean kondisi = true;
    while (kondisi){
        menu();
        switch (in.nextInt()) {
            case 1 :
                String judulLagu = in.next();
                String namaPenyanyi = in.next();

                if (in.next().equals("y")) {
                    playerlists.addLast(new playerlist(judulLagu,namaPenyanyi));
                }else {
                    break;
                }
                break;
                case 2:
                        System.out.println("1.Hapus lagu pilihan");
                        System.out.println("2.Hapus terakhir");
                        if (in.nextInt()==1){
                            removeWithJudul(playerlists, in.next());
                        }else {
                            playerlists.removeLast();
                        }
                        break;
                    case 3 :
                        print (playerlists);
                break;
                    default :
                        kondisi = false;
                        break;
                }
        }
    }
public static void print (LinkedList playerlists){
        ListIterator<playerlist>iterator = playerlists.listIterator();


        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if ( iterator.hasNext()){
                System.out.print("-");
            }
        }
            System.out.println();

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()){
                System.out.print("-");
            }
        }
            System.out.println("\n---habis---");
        }
    public static void removeWithJudul (LinkedList playerlists,String judul){
        ListIterator<playerlist> iterator = playerlists.listIterator();
        while (iterator.hasNext()){
            playerlist playerlist = iterator.next();
            if(playerlist.getJudulLagu().equals(judul)){
                iterator.remove();
                System.out.println("---berhasil---");
            }
        }
        }
    public static void menu (){
        System.out.println("menu player list");
        System.out.println("1. Input lagu");
        System.out.println("2. Hapus lagu");
        System.out.println("3. Mainkan lagu");
        System.out.println("4. Keluar");
    }
}
