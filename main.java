//Thanks for Moon Monkey's help!



import edu.princeton.cs.algs4.*;


//main
public class main{
  public static void main(String[] args) {
    int m;
    double S = 0.0;//面积
    double per;//占正方形的百分比
    StdOut.println("Please input m(number of the circles):");
    m = StdIn.readInt();
    StdOut.println("m is "+ m);
    Circle []cir = new Circle[m];
    cir[0] = new Circle(1,0,0,1);
    for(int i = 1;i < m;i ++){
      cir[i] = new Circle(i+1,0,0,0);
      confirmCir(cir,i);
    }
    for(int i = 0;i < m;i ++){
      cir[i].Draw();
      S += Math.PI*(cir[i].getR()*cir[i].getR());
    }
    per = S/4.0;
    StdOut.println("Total are:"+ S +"\nPercent:"+ per);
    //Circle c = new Circle(z,0,0.5);
    //StdOut.println("sin(30d) is :"+z+" PI: "+ Math.PI);
  }
  
  
  
  //confirmCircle
  public static void confirmCir(Circle cir[],int m)
  {
    //Choose x,y,r of circle[i]
        //THE LARGEST VALUE
        double X = 0.0;
        double Y = 0.0;
        double R = 0.0;
        //LOG EACH CASE
        double x;
        double y;
        double r;
        //double []max1 = new double[i]
        //part 1          2^[log2(m)]----m
         //RIGHT UP
         int j;
         int flag;
        for( j = 0,flag = 0;j < m;j ++ ){
          if( Math.abs(cir[j].getX() - (1-cir[j].getR()) )<=0.0000000001
           && Math.abs(cir[j].getY() - (1-cir[j].getR()) )<=0.0000000001){
            flag = 0;
            for(int k = 0;k < m;k ++){
              if(Math.abs( cir[j].getX()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getX())<=0.0000000001
              && Math.abs( cir[j].getY()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getY())<=0.0000000001){
              flag = 1;
              break;
              }
            }
            if(flag == 0 && (3-2*Math.sqrt(2))*cir[j].getR()>R){
                X = cir[j].getX()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                Y = cir[j].getY()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                R = (3-2*Math.sqrt(2))*cir[j].getR();
              }
          }
        }


         //RIGHT DOWN
        for( j = 0,flag = 0;j < m;j ++ ){
          if( Math.abs(cir[j].getX() - (1-cir[j].getR()) )<=0.0000000001
           && Math.abs(cir[j].getY() - (-1+cir[j].getR()) )<=0.0000000001){
            flag = 0;
            for(int k = 0;k < m;k ++){
              if(Math.abs( cir[j].getX()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getX())<=0.0000000001
              && Math.abs( cir[j].getY()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getY())<=0.0000000001){
                flag = 1;
                break;
              }
            }
            if(flag == 0 && (3-2*Math.sqrt(2))*cir[j].getR()>R){
                X = cir[j].getX()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                Y = cir[j].getY()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                R = (3-2*Math.sqrt(2))*cir[j].getR();

              }

          }
        }


         //LEFT DOWN
         for( j = 0,flag = 0;j < m;j ++ ){
           if( Math.abs(cir[j].getX() - (-1+cir[j].getR()) )<=0.0000000001
            && Math.abs(cir[j].getY() - (-1+cir[j].getR()) )<=0.0000000001){
             flag = 0;
             for(int k = 0;k < m;k ++){
               if(Math.abs( cir[j].getX()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getX())<=0.0000000001
               && Math.abs( cir[j].getY()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getY())<=0.0000000001){
                 flag = 1;
                 break;
               }
             }
             if(flag == 0 && (3-2*Math.sqrt(2))*cir[j].getR()>R){
                 X = cir[j].getX()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                 Y = cir[j].getY()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                 R = (3-2*Math.sqrt(2))*cir[j].getR();

               }
           }
         }

         //LEFT UP
         for( j = 0,flag = 0;j < m;j ++ ){
           if( Math.abs(cir[j].getX() - (-1+cir[j].getR()) )<=0.0000000001
            && Math.abs(cir[j].getY() - (1-cir[j].getR()) )<=0.0000000001){
             flag = 0;
             for(int k = 0;k < m;k ++){
               if(Math.abs( cir[j].getX()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getX())<=0.0000000001
               && Math.abs( cir[j].getY()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2 -cir[k].getY())<=0.0000000001){
                 flag = 1;
                 break;
               }
             }
             if(flag == 0 && (3-2*Math.sqrt(2))*cir[j].getR()>R){
                 X = cir[j].getX()-Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                 Y = cir[j].getY()+Math.sqrt(2)*(4-2*Math.sqrt(2))*cir[j].getR()/2;
                 R = (3-2*Math.sqrt(2))*cir[j].getR();

               }

           }
         }



        //part 2
        //1-----UP
        for(j=0;j < m;j ++){
          for(int k = 1;k < m;k ++){
            //Two existed circles are close to each ohter;
            if(     Math.abs(   (cir[j].getX()-cir[k].getX())*(cir[j].getX()-cir[k].getX())
            +(cir[j].getY()-cir[k].getY())*(cir[j].getY()-cir[k].getY())
            -(cir[j].getR()+cir[k].getR())*(cir[j].getR()+cir[k].getR()) ) <0.000000000001
            && Math.abs(cir[j].getY() + cir[j].getR() -1) <0.00000000001
            && Math.abs(cir[k].getY() + cir[k].getR() -1) <0.00000000001        ){
              //StdOut.println(cir[k].getX()+" "+cir[k].getY());
              flag = 0;
              r = cir[j].getR()*cir[k].getR()/( cir[j].getR()+cir[k].getR()+2*Math.sqrt(cir[j].getR()*cir[k].getR()) );
              y = 1-r;
              if(cir[j].getX() < cir[k].getX()) x = cir[j].getX()+2*Math.sqrt( r*cir[j].getR() );
              else x = cir[k].getX()+2*Math.sqrt( r*cir[k].getR() );
              //Judge if existed
              for(int i = 0; i < m;i ++){
                if(Math.abs( x -cir[i].getX())<=0.0000000000001
                && Math.abs( y -cir[i].getY())<=0.0000000000001){
                  flag = 1;
                  break;
                }
              }
              if(r >= R && 0 == flag){
                R = r;
                Y = y;
                X = x;
              }
            }
          }
        }
          //2-----DOWN
          for(j=0;j < m;j ++){
            for(int k = 1;k < m;k ++){
              //Two existed circles are close to each ohter;
              if(     Math.abs(   (cir[j].getX()-cir[k].getX())*(cir[j].getX()-cir[k].getX())
              +(cir[j].getY()-cir[k].getY())*(cir[j].getY()-cir[k].getY())
              -(cir[j].getR()+cir[k].getR())*(cir[j].getR()+cir[k].getR()) ) <0.00000000001
              && Math.abs(cir[j].getY() - cir[j].getR() +1) <0.00000000001
              && Math.abs(cir[k].getY() - cir[k].getR() +1) <0.00000000001        ){
                //StdOut.println(cir[k].getX()+" "+cir[k].getY());
                flag = 0;
                r = cir[j].getR()*cir[k].getR()/( cir[j].getR()+cir[k].getR()+2*Math.sqrt(cir[j].getR()*cir[k].getR()) );
                y = -1+r;
                if(cir[j].getX() < cir[k].getX()) x = cir[j].getX()+2*Math.sqrt( r*cir[j].getR() );
                else x = cir[k].getX()+2*Math.sqrt( r*cir[k].getR() );
                //Judge if existed
                for(int i = 0; i < m;i ++){
                  if(Math.abs( x -cir[i].getX())<=0.0000000000001
                  && Math.abs( y -cir[i].getY())<=0.0000000000001){
                    flag = 1;
                    break;
                  }
                }
                if(r>R && 0 == flag){
                  R = r;
                  Y = y;
                  X = x;
                }
              }
            }
          }

           //3-----RIGHT
          for(j=0;j < m;j ++){
            for(int k = 1;k < m;k ++){
              //Two existed circles are close to each ohter;
              if(     Math.abs(   (cir[j].getX()-cir[k].getX())*(cir[j].getX()-cir[k].getX())
              +(cir[j].getY()-cir[k].getY())*(cir[j].getY()-cir[k].getY())
              -(cir[j].getR()+cir[k].getR())*(cir[j].getR()+cir[k].getR()) ) <0.000000000001
              && Math.abs(cir[j].getX() + cir[j].getR() -1) <0.00000000001
              && Math.abs(cir[k].getX() + cir[k].getR() -1) <0.00000000001        ){
                //StdOut.println(cir[k].getX()+" "+cir[k].getY());
                flag = 0;
                r = cir[j].getR()*cir[k].getR()/( cir[j].getR()+cir[k].getR()+2*Math.sqrt(cir[j].getR()*cir[k].getR()) );
                x = 1-r;
                if(cir[j].getY() < cir[k].getY()) y = cir[j].getY()+2*Math.sqrt( r*cir[j].getR() );
                else y = cir[k].getY()+2*Math.sqrt( r*cir[k].getR() );
                //Judge if existed
                for(int i = 0; i < m;i ++){
                  if(Math.abs( x -cir[i].getX())<=0.0000000000001
                  && Math.abs( y -cir[i].getY())<=0.0000000000001){
                    flag = 1;
                    break;
                  }
                }
                if(r >= R && 0 == flag){
                  R = r;
                  Y = y;
                  X = x;
                }
              }
            }
          }
            //4-----UP
          for(j=0;j < m;j ++){
            for(int k = 1;k < m;k ++){
              //Two existed circles are close to each ohter;
              if(     Math.abs(   (cir[j].getX()-cir[k].getX())*(cir[j].getX()-cir[k].getX())
              +(cir[j].getY()-cir[k].getY())*(cir[j].getY()-cir[k].getY())
              -(cir[j].getR()+cir[k].getR())*(cir[j].getR()+cir[k].getR()) ) <0.000000000001
              && Math.abs(cir[j].getX() - cir[j].getR() +1) <0.00000000001
              && Math.abs(cir[k].getX() - cir[k].getR() +1) <0.00000000001        ){
                //StdOut.println(cir[k].getX()+" "+cir[k].getY());
                flag = 0;
                r = cir[j].getR()*cir[k].getR()/( cir[j].getR()+cir[k].getR()+2*Math.sqrt(cir[j].getR()*cir[k].getR()) );
                x = -1+r;
                if(cir[j].getY() < cir[k].getY()) y = cir[j].getY()+2*Math.sqrt( r*cir[j].getR() );
                else y = cir[k].getY()+2*Math.sqrt( r*cir[k].getR() );
                //Judge if existed
                for(int i = 0; i < m;i ++){
                  if(Math.abs( x -cir[i].getX())<=0.0000000000001
                  && Math.abs( y -cir[i].getY())<=0.0000000000001){
                    flag = 1;
                    break;
                  }
                }
                if(r >= R && 0 == flag){
                  R = r;
                  Y = y;
                  X = x;
                }
              }
            }
          }




        //part 3
        double a;
        double b;
        double c;
        double x1,x2,x3,y1,y2,y3;
        double rx,ry;

        for(j = 0;j < m;j ++){
          for(int k = 0;k < m;k ++){
            for(int n = 0; n < m;n ++){
              if( Math.abs(   (cir[j].getX()-cir[k].getX())*(cir[j].getX()-cir[k].getX())
              +(cir[j].getY()-cir[k].getY())*(cir[j].getY()-cir[k].getY())
              -(cir[j].getR()+cir[k].getR())*(cir[j].getR()+cir[k].getR()) ) <0.000000000001
              && Math.abs(   (cir[j].getX()-cir[n].getX())*(cir[j].getX()-cir[n].getX())
              +(cir[j].getY()-cir[n].getY())*(cir[j].getY()-cir[n].getY())
              -(cir[j].getR()+cir[n].getR())*(cir[j].getR()+cir[n].getR()) ) <0.000000000001
              && Math.abs(   (cir[n].getX()-cir[k].getX())*(cir[n].getX()-cir[k].getX())
              +(cir[n].getY()-cir[k].getY())*(cir[n].getY()-cir[k].getY())
              -(cir[n].getR()+cir[k].getR())*(cir[n].getR()+cir[k].getR()) ) <0.000000000001  ){
                a = cir[j].getR();
                b = cir[k].getR();
                c = cir[n].getR();
                r = a*b*c/(a*b + b*c + c*a + 2*Math.sqrt(a*b*c*(a+b+c)));
                rx = (a - b)*r/(a + b);
                ry = 2*Math.sqrt(a*b*r*(a+b+r))/(a + b);
                //if(cir[j].getY() < cir[n].getY() && cir[k].getY() < cir[n].getY()){
                x1 = cir[j].getX();
                x2 = cir[k].getX();
                x3 = cir[n].getX();
                y1 = cir[j].getY();
                y2 = cir[k].getY();
                y3 = cir[n].getY();

                /*
                  x1 = cir[j].getX();
                  x2 = cir[k].getX();
                  y1 = cir[j].getY();
                  y2 = cir[k].getY();*/
                  //x1 > x2
                if(x1 - x2 < 0){
                  //y1 > y2        1
                  if(y1 - y2 < 0){
                    if(y3 - y1 > 0||x3 - x1 > 0){
                      x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                      y = y1 - ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                    }
                    //else break;
                    else{
                      if(y3 - y2 < 0||x3 - x2 < 0){
                        ry = -ry;
                        x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                      else{
                        break;
                        //x = x1 + ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        //y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                    }
                  }
                  //y1 < y2       4
                  else{
                    if(y3 - y2 > 0||x3 - x1 > 0){
                      x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                      y = y1 - ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                    }
                    //else break;
                    else{
                      if(y3 - y1 < 0||x3 - x2 < 0){
                        ry = -ry;
                        x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                      else{
                        break;
                        //x = x1 + ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        //y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                    }
                  }
                }
                //x1 < x2
                else{
                  //y1 > y2       2
                  if(y1 - y2 > 0){
                    if(y3 - y1 > 0||x3 - x2 > 0){
                      ry = -ry;
                      x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                      y = y1 - ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                    }
                    //else break;
                    else{
                      if(y3 - y2 < 0||x3 - x1 < 0){

                        x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                      else{
                        break;
                        //x = x1 + ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        //y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                    }
                  }
                  //y1 < y2        3
                  else{
                    if(y3 - y2 > 0||x3 - x2 > 0){
                      ry = -ry;
                      x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                      y = y1 - ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                    }
                    //else break;
                    else{
                      if(y3 - y1 < 0||x3 - x1 < 0){

                        x = x1 - ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                      else{
                        break;
                        //x = x1 + ( (x1 - x2)*(a + rx)/(a + b) - ry*(y1 - y2)/(a + b) );
                        //y = y1 + ( (y1 - y2)*(ry)/(a + b) + (a + rx)*(x1 - x2)/(a + b) );
                      }
                    }
                  }
                }

                //Judge if existed
                flag = 0;
                for(int i = 0; i < m;i ++){
                  if(Math.abs( x -cir[i].getX())<=0.0000000000001
                  && Math.abs( y -cir[i].getY())<=0.0000000000001){
                    flag = 1;
                    break;
                  }
                }
                if(r > R && 0 == flag){
                  R = r;
                  Y = y;
                  X = x;
                }
              }
            }
          }
        }
//CHANGE VALUE
  cir[m].setX(X);
  cir[m].setY(Y);
  cir[m].setR(R);
  }
}
