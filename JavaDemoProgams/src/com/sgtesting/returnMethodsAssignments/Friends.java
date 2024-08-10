package com.sgtesting.returnMethodsAssignments;
class NameFriends{
    String [] FriendsNama(){
        String [] name=new String[]{"Friend1","Friend2","Friend3"};
        return name;
    }
}
public class Friends {
    public static void main(String[] args) {
        NameFriends nf=new NameFriends();
        String[] Myfriends=nf.FriendsNama();
        for(int i=0;i<Myfriends.length;i++){
            System.out.println(Myfriends[i]);
        }
    }
}
