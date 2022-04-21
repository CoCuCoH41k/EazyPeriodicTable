package app.main.ept;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class Beginner {

    @FXML
    private Button Ac;

    @FXML
    private Button Ag;

    @FXML
    private Button Al;

    @FXML
    private Button Am;

    @FXML
    private Button Ar;

    @FXML
    private Button As;

    @FXML
    private Button At;

    @FXML
    private Button Au;

    @FXML
    private Button B;

    @FXML
    private Button Ba;

    @FXML
    private Button Be;

    @FXML
    private Button Bh;

    @FXML
    private Button Bi;

    @FXML
    private Button Bk;

    @FXML
    private Button Br;

    @FXML
    private Button C;

    @FXML
    private Button Ca;

    @FXML
    private Button Cd;

    @FXML
    private Button Ce;

    @FXML
    private Button Cf;

    @FXML
    private Button Cl;

    @FXML
    private Button Cm;

    @FXML
    private Button Cn;

    @FXML
    private Button Co;

    @FXML
    private Button Cr;

    @FXML
    private Button Cs;

    @FXML
    private Button Cu;

    @FXML
    private Button Db;

    @FXML
    private Button Ds;

    @FXML
    private Button Dy;

    @FXML
    private Button Er;

    @FXML
    private Button Es;

    @FXML
    private Button Eu;

    @FXML
    private Button F;

    @FXML
    private Button Fe;

    @FXML
    private Button Fl;

    @FXML
    private Button Fm;

    @FXML
    private Button Fr;

    @FXML
    private Button Ga;

    @FXML
    private Button Gd;

    @FXML
    private Button Ge;

    @FXML
    private Button H;

    @FXML
    private Button He;

    @FXML
    private Button Hf;

    @FXML
    private Button Hg;

    @FXML
    private Button Ho;

    @FXML
    private Button Hs;

    @FXML
    private Button I;

    @FXML
    private Button In;

    @FXML
    private Button Ir;

    @FXML
    private Button K;

    @FXML
    private Button Kr;

    @FXML
    private Button La;

    @FXML
    private Button Li;

    @FXML
    private Button Lr;

    @FXML
    private Button Lu;

    @FXML
    private Button Lv;

    @FXML
    private Button Mc;

    @FXML
    private Button Md;

    @FXML
    private Button Mg;

    @FXML
    private Button Mn;

    @FXML
    private Button Mo;

    @FXML
    private Button Mt;

    @FXML
    private Button N;

    @FXML
    private Button Na;

    @FXML
    private Button Nb;

    @FXML
    private Button Nd;

    @FXML
    private Button Ne;

    @FXML
    private Button Nh;

    @FXML
    private Button Ni;

    @FXML
    private Button No;

    @FXML
    private Button Np;

    @FXML
    private Button O;

    @FXML
    private Button Og;

    @FXML
    private Button Os;

    @FXML
    private Button P;

    @FXML
    private Button Pa;

    @FXML
    private Button Pb;

    @FXML
    private Button Pd;

    @FXML
    private Button Pm;

    @FXML
    private Button Po;

    @FXML
    private Button Pr;

    @FXML
    private Button Pt;

    @FXML
    private Button Pu;

    @FXML
    private Button Ra;

    @FXML
    private Button Rb;

    @FXML
    private Button Re;

    @FXML
    private Button Rf;

    @FXML
    private Button Rg;

    @FXML
    private Button Rh;

    @FXML
    private Button Rn;

    @FXML
    private Button Ru;

    @FXML
    private Button S;

    @FXML
    private Button Sb;

    @FXML
    private Button Sc;

    @FXML
    private Button Se;

    @FXML
    private Button Sg;

    @FXML
    private Button Si;

    @FXML
    private Button Sm;

    @FXML
    private Button Sn;

    @FXML
    private Button Sr;

    @FXML
    private Button Ta;

    @FXML
    private Button Tb;

    @FXML
    private Button Tc;

    @FXML
    private Button Te;

    @FXML
    private Button Th;

    @FXML
    private Button Ti;

    @FXML
    private Button Tl;

    @FXML
    private Button Tm;

    @FXML
    private Button Ts;

    @FXML
    private Button U;

    @FXML
    private Button V;

    @FXML
    private Button W;

    @FXML
    private Button Xe;

    @FXML
    private Button Y;

    @FXML
    private Button Yb;

    @FXML
    private Button Zn;

    @FXML
    private Button Zr;

    @FXML
    private void initialize(){
        H.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Scenes.Load("H");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        He.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Scenes.Load("He");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });





    }

}
