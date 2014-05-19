
package jhotdraw.jhotdrawtesmaven;




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



public final class RPLOOT {
            private static final int INNERPANELAYOUT1 = 20;
            private static final int INNERPANELAYOUT2 = 20;
            private static final int SIZE1 = 700;
            private static final int SIZE2 = 700;
            private static final int FSIZE1 = 600;
            private static final int FSIZE2 = 600;
            private static final int COLORBTN = 12;
            
    private RPLOOT(){}
    
    class Test1 {
    public void test() { 
        
            
            
         ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.draw.Labels");
                DrawingView view1 = new DefaultDrawingView();
                //membuat drawing view
                TextAreaFigure ta = new TextAreaFigure();
                
                DrawingEditor editor = new DefaultDrawingEditor();
                //membuat editor dasar
                editor.add(view1);
                editor.setTool(new DelegationSelectionTool());
                
                view1.setDrawing(createDrawing());
                
                JToolBar tb = new JToolBar();
                //membuat toolbar
                
                SelectionTool selectionTool1 = new SelectionTool();
                
                selectionTool1.setDragTracker(new DnDTracker());

                ButtonFactory.addSelectionToolTo(tb, editor, selectionTool1);
                
                // membuat selectiontool dan menambahkan ke toolbar        
                ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(new RectangleFigure()),
                        "edit.createRectangle",
                        labels);
                tb.setOrientation(JToolBar.VERTICAL);
                
                ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(new EllipseFigure()),
                        "edit.createEllipse",
                        labels);
                
                 ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(new TextAreaFigure()),
                        "edit.createTextArea",
                        labels);
                 
                  ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(new DiamondFigure()),
                        "edit.createDiamond",
                        labels);
                
                  ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(new TriangleFigure()),
                        "edit.createTriangle",
                        labels);
                  
                  ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(new LineConnectionFigure()),
                        "edit.createLineConnection",
                        labels);
                  
                  ButtonFactory.addToolTo(
                        tb, editor,
                        new CreationTool(ta),
                        "edit.createTextArea",
                        labels);
                  
                  ButtonFactory.addColorButtonsTo(tb, editor, Jhot.DEFAULT_COLORS, COLORBTN);

                // Masukan semua ke dalam 1 frame
                JFrame f = new JFrame("Main - Main Program");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(SIZE1, SIZE2);
                JPanel innerPane = new JPanel();
                innerPane.setLayout(new FlowLayout(FlowLayout.LEFT, INNERPANELAYOUT1, INNERPANELAYOUT2));
                //set content
                JScrollPane sp = new JScrollPane(view1.getComponent());
                innerPane.add(sp);
                sp.setPreferredSize(new Dimension(FSIZE1, FSIZE2)); 
                
                //set size dari main window
                f.getContentPane().add(new JScrollPane(innerPane));
                f.getContentPane().add(tb, BorderLayout.WEST); 
                //set toolbar di sebelah kiri layar
                f.setVisible(true);
    } }
   
         
      
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            private RPLOOT.Test1 oi = new RPLOOT().new Test1();
            
           
            
            
            @Override
            public void run() {
              oi.test();
            }
        });
    }


    private static Drawing createDrawing() {
        // membuat default drawing
        // dengan input/outputdasar
         
        DefaultDrawing drawing = new DefaultDrawing();
        drawing.addInputFormat(new SerializationInputOutputFormat());
        //add input
        drawing.addOutputFormat(new SerializationInputOutputFormat());
        //add output
        drawing.addOutputFormat(new ImageOutputFormat());
        return drawing;
    }
}
