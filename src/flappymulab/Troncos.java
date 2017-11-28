/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import java.awt.Rectangle;

/**
 *
 * @author CRIS
 */
public class Troncos {
    
    private Rectangle[] tronco;
    
     public void añadirtroncos(boolean start )
    {
        
        if(start==true){
           this.tronco=new Rectangle[59];
		 
               this.tronco[0]=new Rectangle(2813,3,145,287);			
		this.tronco[1]=new Rectangle(2825,627,129,147);	
                this.tronco[2]=new Rectangle(3523,0,129,443);	
                this.tronco[3]=new Rectangle(4287,5,179,355);	
                this.tronco[4]=new Rectangle(4995,3,135,369);	
                this.tronco[5]=new Rectangle(4995,71,109,71);	
               this. tronco[6]=new Rectangle(5370,7,95,265);	
                this.tronco[7]=new Rectangle(5360,529,93,245);	
                this.tronco[8]=new Rectangle(5762,0,121,435);	
               this. tronco[9]=new Rectangle(6101,0,127,461);	
               this. tronco[10]=new Rectangle(6595,0,119,341);	
               this. tronco[11]=new Rectangle(7115,0,123,479);	
                this.tronco[12]=new Rectangle(7560,0,341,293);	
                this.tronco[13]=new Rectangle(7548,647,331,169);	
                this.tronco[14]=new Rectangle(8164,1,189,371);	
               this. tronco[15]=new Rectangle(8172,599,180,222);	
               this.tronco[16]=new Rectangle(8837,0,126,370);	
                this.tronco[17]=new Rectangle(9160,534,85,263);	
                this.tronco[18]=new Rectangle(9500,0,104,567);	
               this.tronco[19]=new Rectangle(9931,501,228,823);	
                this.tronco[20]=new Rectangle(10374,0,101,288);	
                this.tronco[21]=new Rectangle(10635,578,174,283);	
                this.tronco[22]=new Rectangle(11850,667,321,126);	
                this.tronco[23]=new Rectangle(11905,0,191,334);	
                this.tronco[24]=new Rectangle(12344,0,166,198);	
                this.tronco[25]=new Rectangle(12740,0,171,339);    
                this.tronco[26]=new Rectangle(12631,693,263,179);
                this.tronco[27]=new Rectangle(14261,0,137,307);	
                this.tronco[28]=new Rectangle(14230,643,128,208);	
                this.tronco[29]=new Rectangle(14729,0,124,185);	
                this.tronco[30]=new Rectangle(14718,453,137,294);	
                this.tronco[31]=new Rectangle(15133,0,74,109);	
                this.tronco[32]=new Rectangle(15130,351,112,429);	
                this.tronco[33]=new Rectangle(15697,0,114,321);	
                this.tronco[34]=new Rectangle(15718,480,105,303);	
                this.tronco[35]=new Rectangle(16267,0,114,310);	
                this.tronco[36]=new Rectangle(16830,0,127,148);	
                this.tronco[37]=new Rectangle(17269,0,120,404);	
                this.tronco[38]=new Rectangle(17971,0,117,304);	
                this.tronco[39]=new Rectangle(18591,552,111,237);	
                this.tronco[40]=new Rectangle(19000,0,111,273);	
                this.tronco[41]=new Rectangle(19311,580,307,209);	
                this.tronco[42]=new Rectangle(19845,400,157,309);	
                this.tronco[43]=new Rectangle(21316,8,101,61);	
                this.tronco[44]=new Rectangle(28350,791,101,411);	
                this.tronco[45]=new Rectangle(21639,4,119,188);	
                this.tronco[46]=new Rectangle(21629,528,112,196);
                this.tronco[47]=new Rectangle(21935,3,116,300);	
                this.tronco[48]=new Rectangle(21921,623,117,97);	
                this.tronco[49]=new Rectangle(22891,561,103,219);	
                this.tronco[50]=new Rectangle(23152,2,111,135);	
                this.tronco[51]=new Rectangle(23141,470,101,255);
                this.tronco[52]=new Rectangle(23385,7,103,49);
                this.tronco[53]=new Rectangle(23386,388,106,348);
                this.tronco[54]=new Rectangle(23881,3,107,20);
                this.tronco[55]=new Rectangle(23871,356,110,387);
                this.tronco[56]=new Rectangle(24121,5,112,163);
                this.tronco[57]=new Rectangle(24118,431,121,349);
                this.tronco[58]=new Rectangle(24367,580,114,202);}
	} 
     
     public void velocidad_troncos(boolean gameover, boolean start){
         if (gameover==false){
     for(int i=0;i<59;i++){

tronco[i].x-=15;

}     }else{
         
         
         
         añadirtroncos(start);
         
         
         
         }
     }
     
     public boolean interseccion(Rectangle mula,boolean gameover){
         
        for(int i=0;i<59;i++){

if(tronco[i].intersects(mula)){
    
 
    
 gameover=true;

    
}  
    
}
        
      
        return gameover;
        
        
}

public void reinicio(){
    this.tronco[0].x=2813;			
		this.tronco[1].x=2825;
                this.tronco[2].x=3523;	
                this.tronco[3].x=4287;	
                this.tronco[4].x=4995;	
                this.tronco[5].x=4995;	
               this. tronco[6].x=5370;	
                this.tronco[7].x=5360;	
                this.tronco[8].x=5762;	
               this. tronco[9].x=610;	
               this. tronco[10].x=6595;	
               this. tronco[11].x=7115;	
                this.tronco[12].x=7560;	
                this.tronco[13].x=7548;	
                this.tronco[14].x=8164;	
               this. tronco[15].x=8172;	
               this.tronco[16].x=8837;
                this.tronco[17].x=9160;	
                this.tronco[18].x=9500;	
               this.tronco[19].x=9931;
                this.tronco[20].x=10374;
                this.tronco[21].x=10635;	
                this.tronco[22].x=11850;	
                this.tronco[23].x=11905;	
                this.tronco[24].x=12344;	
                this.tronco[25].x=12740;    
                this.tronco[26].x=12631;
                this.tronco[27].x=14261;	
                this.tronco[28].x=14230;	
                this.tronco[29].x=14729;	
                this.tronco[30].x=14718;	
                this.tronco[31].x=15133;	
                this.tronco[32].x=15130;	
                this.tronco[33].x=15697;	
                this.tronco[34].x=15718;	
                this.tronco[35].x=16267;	
                this.tronco[36].x=16830;	
                this.tronco[37].x=17269;	
                this.tronco[38].x=17971;	
                this.tronco[39].x=18591;	
                this.tronco[40].x=19000;	
                this.tronco[41].x=19311;	
                this.tronco[42].x=19845;	
                this.tronco[43].x=21316;	
                this.tronco[44].x=28350;	
                this.tronco[45].x=21639;	
                this.tronco[46].x=21629;
                this.tronco[47].x=21935;	
                this.tronco[48].x=21921;	
                this.tronco[49].x=22891;	
                this.tronco[50].x=23152;	
                this.tronco[51].x=23141;
                this.tronco[52].x=23385;
                this.tronco[53].x=23386;
                this.tronco[54].x=23881;
                this.tronco[55].x=23871;
                this.tronco[56].x=24121;
                this.tronco[57].x=24118;
                this.tronco[58].x=24367;






}

}