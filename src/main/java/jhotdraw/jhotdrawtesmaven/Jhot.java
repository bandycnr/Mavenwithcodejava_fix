/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jhotdraw.jhotdrawtesmaven;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.jhotdraw.draw.tool.SelectionTool;
import org.jhotdraw.draw.tool.CreationTool;
import org.jhotdraw.draw.tool.DnDTracker;
import org.jhotdraw.draw.io.SerializationInputOutputFormat;
import org.jhotdraw.draw.io.ImageOutputFormat;
import java.awt.*;
import javax.swing.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.draw.action.*;
import org.jhotdraw.util.*;
import java.util.Collections;
import java.util.LinkedList;
import org.jhotdraw.draw.tool.DelegationSelectionTool;


public final class Jhot {
    
     private Jhot() {}
     
      // mengisi variabel warna dengan angka dasar warna
      private static final int WARNA1 = 0x800000;
      private static final int WARNA2 = 0x808000;
      private static final int WARNA3 = 0x008000;
      private static final int WARNA4 = 0x008080;
      private static final int WARNA5 = 0x000080;
      private static final int WARNA6 = 0x800080;
      private static final int WARNA7 = 0x7f7f7f;
      private static final int WARNA8 = 0x808080;
      private static final int WARNA9 = 0xff0000;
      private static final int WARNA10 = 0xffff00;
      
       private static final int WARNA11 = 0x00ff00;
      private static final int WARNA12 = 0x00ffff;
      private static final int WARNA13 = 0x0000ff;
      private static final int WARNA14 = 0xff00ff;
      private static final int WARNA15 = 0x666666;
      private static final int WARNA16 = 0x999999;
      private static final int WARNA17 = 0xff6666;
      private static final int WARNA18 = 0xffff66;
      private static final int WARNA19 = 0x66ff66;
      private static final int WARNA20= 0x66ffff;
      
       private static final int WARNA21 = 0x6666ff;
      private static final int WARNA22 = 0xff66ff;
      private static final int WARNA23 = 0x4c4c4c;
      private static final int WARNA24 = 0xb3b3b3;
      private static final int WARNA25 = 0x804000;
      private static final int WARNA26 = 0x408000;
      private static final int WARNA27 = 0x008040;
      private static final int WARNA28 = 0x004080;
      private static final int WARNA29 = 0x400080;
      private static final int WARNA30 = 0x800040;
      
       private static final int WARNA31 = 0x333333;
      private static final int WARNA32 = 0xcccccc;
      private static final int WARNA33 = 0xff8000;
      private static final int WARNA34 = 0x80ff00;
      private static final int WARNA35 = 0x00ff80;
      private static final int WARNA36 = 0x0080ff;
      private static final int WARNA37 = 0x8000ff;
      private static final int WARNA38 = 0xff0080;
      private static final int WARNA39 = 0x191919;
      private static final int WARNA40 = 0xe6e6e6;
      
       private static final int WARNA41 = 0xffcc66;
      private static final int WARNA42 = 0xccff66;
      private static final int WARNA43 = 0x66ffcc;
      private static final int WARNA44 = 0x66ccff;
      private static final int WARNA45 = 0xcc66ff;
      private static final int WARNA46 = 0xff6fcf;
      private static final int WARNA47 = 0x000000;
      private static final int WARNA48 = 0xffffff;
     
    
     public static final java.util.List<ColorIcon> DEFAULT_COLORS;
     //List WARNA yang akan ditampilkan dalam iconcolor
    static {

        //mengisi variabel warna kedalam linkedlist 
        LinkedList<ColorIcon> m = new LinkedList<ColorIcon>();
        
        
        m.add(new ColorIcon(WARNA1, "Cayenne"));
        m.add(new ColorIcon(WARNA2, "Asparagus"));
        m.add(new ColorIcon(WARNA3, "Clover"));
        m.add(new ColorIcon(WARNA4, "Teal"));
        m.add(new ColorIcon(WARNA5, "Midnight"));
        m.add(new ColorIcon(WARNA6, "Plum"));
        m.add(new ColorIcon(WARNA7, "Tin"));
        m.add(new ColorIcon(WARNA8, "Nickel"));
        m.add(new ColorIcon(WARNA9, "Maraschino"));
        m.add(new ColorIcon(WARNA10, "Lemon"));
        m.add(new ColorIcon(WARNA11, "Spring"));
        m.add(new ColorIcon(WARNA12, "Turquoise"));
        m.add(new ColorIcon(WARNA13, "Blueberry"));
        m.add(new ColorIcon(WARNA14, "Magenta"));
        m.add(new ColorIcon(WARNA15, "Steel"));
        m.add(new ColorIcon(WARNA16, "Aluminium"));
        m.add(new ColorIcon(WARNA17, "Salmon"));
        m.add(new ColorIcon(WARNA18, "Banana"));
        m.add(new ColorIcon(WARNA19, "Flora"));
        m.add(new ColorIcon(WARNA20, "Ice"));
        m.add(new ColorIcon(WARNA21, "Orchid"));
        m.add(new ColorIcon(WARNA22, "Bubblegum"));
        m.add(new ColorIcon(WARNA23, "Iron"));
        m.add(new ColorIcon(WARNA24, "Magnesium"));
        m.add(new ColorIcon(WARNA25, "Mocha"));
        m.add(new ColorIcon(WARNA26, "Fern"));
        m.add(new ColorIcon(WARNA27, "Moss"));
        m.add(new ColorIcon(WARNA28, "Ocean"));
        m.add(new ColorIcon(WARNA29, "Eggplant"));
        m.add(new ColorIcon(WARNA30, "Maroon"));
        m.add(new ColorIcon(WARNA31, "Tungsten"));
        m.add(new ColorIcon(WARNA32, "Silver"));
        m.add(new ColorIcon(WARNA33, "Tangerine"));
        m.add(new ColorIcon(WARNA34, "Lime"));
        m.add(new ColorIcon(WARNA35, "Sea Foam"));
        m.add(new ColorIcon(WARNA36, "Aqua"));
        m.add(new ColorIcon(WARNA37, "Grape"));
        m.add(new ColorIcon(WARNA38, "Strawberry"));
        m.add(new ColorIcon(WARNA39, "Lead"));
        m.add(new ColorIcon(WARNA40, "Mercury"));
        m.add(new ColorIcon(WARNA41, "Cantaloupe"));
        m.add(new ColorIcon(WARNA42, "Honeydew"));
        m.add(new ColorIcon(WARNA43, "Spindrift"));
        m.add(new ColorIcon(WARNA44, "Sky"));
        m.add(new ColorIcon(WARNA45, "Lavender"));
        m.add(new ColorIcon(WARNA46, "Carnation"));
        m.add(new ColorIcon(WARNA47, "Licorice"));
        m.add(new ColorIcon(WARNA48, "Snow"));
        DEFAULT_COLORS = Collections.unmodifiableList(m);
    }
}
