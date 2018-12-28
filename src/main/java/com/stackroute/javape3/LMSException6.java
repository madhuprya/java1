package com.stackroute.javape3;

public class LMSException6 {

    public String[]  seriesCheck(String num){




        String[] stringArray = num.split(",");

        int[] intArray = new int[stringArray.length];



        for(int j=0 ; j<stringArray.length ; j++){

            intArray[j] = Integer.parseInt(stringArray[j]);



        }



        int check;

        String[] result=new String[intArray.length];

        int x,y;

        x= intArray[0];

        y= intArray[1];



        for(int i=0 ; i<intArray.length ; i++) {



            if (x > y) {





                check = intArray[i] - 1;

                if (i == intArray.length - 1) {

                    result[i] = Integer.toString(intArray[i]);

                    break;

                }



                if (check == intArray[i + 1]) {



                    result[i] = Integer.toString(intArray[i]);

                }



            }else if(x<y){



                check = intArray[i] + 1;

                if (i == intArray.length - 1) {

                    result[i] = Integer.toString(intArray[i]);

                    break;

                }



                if(check == intArray[i + 1]) {



                    result[i] = Integer.toString(intArray[i]);

                }



            }else {

                return result;

            }

        }

        return result;

    }
}
