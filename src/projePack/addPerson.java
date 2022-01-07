//backup
/*
package projePack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        person ilkkisi = new person(null, "Alperen", "Derici", "01111998", true); // create new projePack.person object  //TODO BU BIZIZ
        person es = new person(null,"Alperen","Dercii","01111998",false); // create new projePack.person object
        relation rel = new relation(null,null); // create new projePack.relation object
        rel.spouse1 = ilkkisi;
        rel.spouse2 = es;
        ilkkisi.relation.add(rel);
        es.relation.add(rel);

        person cocuk = new person(null,"Alperen","Dercii","01112022",true); // create new projePack.person object

        rel.children.add(cocuk);
        cocuk.parents = rel;


        rel.father.add(ilkkisi);
        rel.partner.add(es); //Bunu buraya c den ekliyorsak mother olur a dan ekliyorsak partner olur eger kendisinden ekliyorsak??
        //System.out.println(rel);

        person baba = new person(null,"Ali","Deerici","12011940",true);
        relation rel2 = new relation(null, null);//Buraya dikkat == deneme
        rel2.spouse1= baba;
        rel2.spouse2 = ilkkisi;
        rel2.father.add(baba);
        rel2.children.add(ilkkisi);

        ilkkisi.parents = rel2;

        person amca = new person(null,"Alpi","Derici","011219930",true);
        relation rel3 = new relation(null,null);
        rel3.spouse1 = amca;
        rel3.spouse2 = baba;
        rel3.brother.add(amca);
        rel3.brother.add(baba);

        ilkkisi.parents.brother.add(amca);//bu nasil mumkun olacak?



//        while(ilkkisi.relation != null){//ilk kisi bos degilse ve ilk kisinin relationi bos degilse (cunku baba relationa ekleniyor)
//
//            if(ilkkisi.parents.father != null && ilkkisi.parents.brother != null ){
//
//                    System.out.println("amca: "+ilkkisi.parents.brother);
//                    break;
//                   // if (ilkkisi.relation.contains(ilkkisi.parents.father.contains(ilkkisi.parents.brother))){
//                    if (){
//                        System.out.println("Amca");
//                    }else {
//                        System.out.println("Hala");
//                    }
//                }
//            }
//        }

    }
}
*/
