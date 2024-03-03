package com.zipcodewilmington.scientificcalculator;
import java.lang.String;
import java.util.Scanner;

import static java.lang.Math.*;

public class Scientific {
        private int value;
        private String con;

        private double save;

        private double currentVal;

        public Scientific() {
                this.value = 0;
                this.con = "";
                this.currentVal = currentVal;


        }

        public double getA() {
                return save;
        }

        public void setSave(double save) { this.save = save;

        }

        public int getValue() {
                return value;
        }

        public void setValue(int value) {
                this.value = value;
        }

        public String getCon (){
                return con;
        }

        public void setCon(String con) {
                this.con = con;
        }

        public String binCon(int num) {
                this.con = Integer.toBinaryString(num);
                return this.con;
        }

        public String octCon (int num1) {

                this.con = Integer.toOctalString(num1);

                return this.con;
        }

        public String decCon(int num2) {

                return this.con;
        }

        public String hexCon() {

                this.con = Integer.toHexString(this.value);

                return this.con;
        }

        public double getSine(){
                this.currentVal = sin(this.currentVal);
                return this.currentVal;

        }

        public double getCosine(){
                this.currentVal = cos(this.currentVal);
                return this.currentVal;

        }

        public double getTangent(){
                this.currentVal = tan(this.currentVal);
                return this.currentVal;

        }

        public double getInsine(){
                this.currentVal = asin(this.currentVal);
                return this.currentVal;

        }

        public double getIncosine(){
                this.currentVal = acos(this.currentVal);
                return this.currentVal;

        }

        public double getIntangent(){
                this.currentVal = atan(this.currentVal);
                return this.currentVal;

        }
}



