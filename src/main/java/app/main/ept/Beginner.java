package app.main.ept;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
public class Beginner {
    private String ElementName;private String ElementDesc;private Float ElementMass;private Integer ElementPos;
    private void SecondStageShow(String ThisName, Integer ThisPosition, Float ThisAtomMass, String ThisDescription) throws IOException{
        FXMLLoader SecLoader = new FXMLLoader(getClass().getResource("Element.fxml"));
        Parent ROOT = SecLoader.load();
        ElementsController Controller = SecLoader.getController();
        Controller.ChangeInformation(ThisName, ThisPosition, ThisAtomMass, ThisDescription);
        Stage Stage = new Stage();
        Stage.setScene(new Scene(ROOT));
        Stage.show();
    }
    private void SetupForStage(String FxBtnId, String ElName, Integer ElPos, Float ElMass, String ElDesc){
        ElementName = ElName;
        ElementPos  = ElPos;
        ElementMass = ElMass;
        ElementDesc = ElDesc;
        try {SecondStageShow(ElementName, ElementPos, ElementMass, ElementDesc);} catch (IOException e) {e.printStackTrace();}
    }


    @FXML
    private Button // Periodic Table
    H,                                                                  He,
    Li, Be,                                         B , C , N , O , F , Ne,
    Na, Mg,                                         Al, Si, P , S , Cl, Ar,
    K , Ca, Sc, Ti, V , Cr, Mn, Fe, Co, Ni, Cu, Zn, Ga, Ge, As, Se, Br, Kr,
    Rb, Sr, Y , Zr, Nb, Mo, Tc, Ru, Rh, Pd, Ag, Cd, In, Sn, Sb, Te, I , Xe,
    Cs, Ba,     Hf, Ta, W , Re, Os, Ir, Pt, Au, Hg, Tl, Pb, Bi, Po, At, Rn,
    Fr, Ra,     Rf, Db, Sg, Bh, Hs, Mt, Ds, Rg, Cn, Nh, Fl, Mc, Lv, Ts, Og,

                La, Ce, Pr, Nd, Pm, Sm, Eu, Gd, Tb, Dy, Ho, Er, Tm, Yb, Lu,
                Ac, Th, Pa, U , Np, Pu, Am, Cm, Bk, Cf, Es, Fm, Md, No, Lr;
    @FXML
    private void initialize(){
        H.setOnAction(actionEvent -> SetupForStage(H.getId(), Element.H.Name, Element.H.Pos, Element.H.AtomMass, Element.H.Desc));
        He.setOnAction(actionEvent -> SetupForStage(He.getId(), Element.He.Name, Element.He.Pos, Element.He.AtomMass, Element.He.Desc));
        Li.setOnAction(actionEvent -> SetupForStage(Li.getId(), Element.Li.Name, Element.Li.Pos, Element.Li.AtomMass, Element.Li.Desc));
        Be.setOnAction(actionEvent -> SetupForStage(Be.getId(), Element.Be.Name, Element.Be.Pos, Element.Be.AtomMass, Element.Be.Desc));
        B.setOnAction(actionEvent -> SetupForStage(B.getId(), Element.B.Name, Element.B.Pos, Element.B.AtomMass, Element.B.Desc));
        C.setOnAction(actionEvent -> SetupForStage(C.getId(), Element.C.Name, Element.C.Pos, Element.C.AtomMass, Element.C.Desc));
        N.setOnAction(actionEvent -> SetupForStage(N.getId(), Element.N.Name, Element.N.Pos, Element.N.AtomMass, Element.N.Desc));
        O.setOnAction(actionEvent -> SetupForStage(O.getId(), Element.O.Name, Element.O.Pos, Element.O.AtomMass, Element.O.Desc));
        F.setOnAction(actionEvent -> SetupForStage(F.getId(), Element.F.Name, Element.F.Pos, Element.F.AtomMass, Element.F.Desc));
        Ne.setOnAction(actionEvent -> SetupForStage(Ne.getId(), Element.Ne.Name, Element.Ne.Pos, Element.Ne.AtomMass, Element.Ne.Desc));
        Na.setOnAction(actionEvent -> SetupForStage(Na.getId(), Element.Na.Name, Element.Na.Pos, Element.Na.AtomMass, Element.Na.Desc));
        Mg.setOnAction(actionEvent -> SetupForStage(Mg.getId(), Element.Mg.Name, Element.Mg.Pos, Element.Mg.AtomMass, Element.Mg.Desc));
        Al.setOnAction(actionEvent -> SetupForStage(Al.getId(), Element.Al.Name, Element.Al.Pos, Element.Al.AtomMass, Element.Al.Desc));
        Si.setOnAction(actionEvent -> SetupForStage(Si.getId(), Element.Si.Name, Element.Si.Pos, Element.Si.AtomMass, Element.Si.Desc));
        P.setOnAction(actionEvent -> SetupForStage(P.getId(), Element.P.Name, Element.P.Pos, Element.P.AtomMass, Element.P.Desc));
        S.setOnAction(actionEvent -> SetupForStage(S.getId(), Element.S.Name, Element.S.Pos, Element.S.AtomMass, Element.S.Desc));
        Cl.setOnAction(actionEvent -> SetupForStage(Cl.getId(), Element.Cl.Name, Element.Cl.Pos, Element.Cl.AtomMass, Element.Cl.Desc));
        Ar.setOnAction(actionEvent -> SetupForStage(Ar.getId(), Element.Ar.Name, Element.Ar.Pos, Element.Ar.AtomMass, Element.Ar.Desc));
        K.setOnAction(actionEvent -> SetupForStage(K.getId(), Element.K.Name, Element.K.Pos, Element.K.AtomMass, Element.K.Desc));
        Ca.setOnAction(actionEvent -> SetupForStage(Ca.getId(), Element.Ca.Name, Element.Ca.Pos, Element.Ca.AtomMass, Element.Ca.Desc));
        Sc.setOnAction(actionEvent -> SetupForStage(Sc.getId(), Element.Sc.Name, Element.Sc.Pos, Element.Sc.AtomMass, Element.Sc.Desc));
        Ti.setOnAction(actionEvent -> SetupForStage(Ti.getId(), Element.Ti.Name, Element.Ti.Pos, Element.Ti.AtomMass, Element.Ti.Desc));
        V.setOnAction(actionEvent -> SetupForStage(V.getId(), Element.V.Name, Element.V.Pos, Element.V.AtomMass, Element.V.Desc));
        Cr.setOnAction(actionEvent -> SetupForStage(Cr.getId(), Element.Cr.Name, Element.Cr.Pos, Element.Cr.AtomMass, Element.Cr.Desc));
        Mn.setOnAction(actionEvent -> SetupForStage(Mn.getId(), Element.Mn.Name, Element.Mn.Pos, Element.Mn.AtomMass, Element.Mn.Desc));
        Fe.setOnAction(actionEvent -> SetupForStage(Fe.getId(), Element.Fe.Name, Element.Fe.Pos, Element.Fe.AtomMass, Element.Fe.Desc));
        Co.setOnAction(actionEvent -> SetupForStage(Co.getId(), Element.Co.Name, Element.Co.Pos, Element.Co.AtomMass, Element.Co.Desc));
        Ni.setOnAction(actionEvent -> SetupForStage(Ni.getId(), Element.Ni.Name, Element.Ni.Pos, Element.Ni.AtomMass, Element.Ni.Desc));
        Cu.setOnAction(actionEvent -> SetupForStage(Cu.getId(), Element.Cu.Name, Element.Cu.Pos, Element.Cu.AtomMass, Element.Cu.Desc));
        Zn.setOnAction(actionEvent -> SetupForStage(Zn.getId(), Element.Zn.Name, Element.Zn.Pos, Element.Zn.AtomMass, Element.Zn.Desc));
        Ga.setOnAction(actionEvent -> SetupForStage(Ga.getId(), Element.Ga.Name, Element.Ga.Pos, Element.Ga.AtomMass, Element.Ga.Desc));
        Ge.setOnAction(actionEvent -> SetupForStage(Ge.getId(), Element.Ge.Name, Element.Ge.Pos, Element.Ge.AtomMass, Element.Ge.Desc));
        As.setOnAction(actionEvent -> SetupForStage(As.getId(), Element.As.Name, Element.As.Pos, Element.As.AtomMass, Element.As.Desc));
        Se.setOnAction(actionEvent -> SetupForStage(Se.getId(), Element.Se.Name, Element.Se.Pos, Element.Se.AtomMass, Element.Se.Desc));
        Br.setOnAction(actionEvent -> SetupForStage(Br.getId(), Element.Br.Name, Element.Br.Pos, Element.Br.AtomMass, Element.Br.Desc));
        Kr.setOnAction(actionEvent -> SetupForStage(Kr.getId(), Element.Kr.Name, Element.Kr.Pos, Element.Kr.AtomMass, Element.Kr.Desc));
        Rb.setOnAction(actionEvent -> SetupForStage(Rb.getId(), Element.Rb.Name, Element.Rb.Pos, Element.Rb.AtomMass, Element.Rb.Desc));
        Sr.setOnAction(actionEvent -> SetupForStage(Sr.getId(), Element.Sr.Name, Element.Sr.Pos, Element.Sr.AtomMass, Element.Sr.Desc));
        Y.setOnAction(actionEvent -> SetupForStage(Y.getId(), Element.Y.Name, Element.Y.Pos, Element.Y.AtomMass, Element.Y.Desc));
        Zr.setOnAction(actionEvent -> SetupForStage(Zr.getId(), Element.Zr.Name, Element.Zr.Pos, Element.Zr.AtomMass, Element.Zr.Desc));
        Nb.setOnAction(actionEvent -> SetupForStage(Nb.getId(), Element.Nb.Name, Element.Nb.Pos, Element.Nb.AtomMass, Element.Nb.Desc));
        Mo.setOnAction(actionEvent -> SetupForStage(Mo.getId(), Element.Mo.Name, Element.Mo.Pos, Element.Mo.AtomMass, Element.Mo.Desc));
        Tc.setOnAction(actionEvent -> SetupForStage(Tc.getId(), Element.Tc.Name, Element.Tc.Pos, Element.Tc.AtomMass, Element.Tc.Desc));
        Ru.setOnAction(actionEvent -> SetupForStage(Ru.getId(), Element.Ru.Name, Element.Ru.Pos, Element.Ru.AtomMass, Element.Ru.Desc));
        Rh.setOnAction(actionEvent -> SetupForStage(Rh.getId(), Element.Rh.Name, Element.Rh.Pos, Element.Rh.AtomMass, Element.Rh.Desc));
        Pd.setOnAction(actionEvent -> SetupForStage(Pd.getId(), Element.Pd.Name, Element.Pd.Pos, Element.Pd.AtomMass, Element.Pd.Desc));
        Ag.setOnAction(actionEvent -> SetupForStage(Ag.getId(), Element.Ag.Name, Element.Ag.Pos, Element.Ag.AtomMass, Element.Ag.Desc));
        Cd.setOnAction(actionEvent -> SetupForStage(Cd.getId(), Element.Cd.Name, Element.Cd.Pos, Element.Cd.AtomMass, Element.Cd.Desc));
        In.setOnAction(actionEvent -> SetupForStage(In.getId(), Element.In.Name, Element.In.Pos, Element.In.AtomMass, Element.In.Desc));
        Sn.setOnAction(actionEvent -> SetupForStage(Sn.getId(), Element.Sn.Name, Element.Sn.Pos, Element.Sn.AtomMass, Element.Sn.Desc));
        Sb.setOnAction(actionEvent -> SetupForStage(Sb.getId(), Element.Sb.Name, Element.Sb.Pos, Element.Sb.AtomMass, Element.Sb.Desc));
        Te.setOnAction(actionEvent -> SetupForStage(Te.getId(), Element.Te.Name, Element.Te.Pos, Element.Te.AtomMass, Element.Te.Desc));
        I.setOnAction(actionEvent -> SetupForStage(I.getId(), Element.I.Name, Element.I.Pos, Element.I.AtomMass, Element.I.Desc));
        Xe.setOnAction(actionEvent -> SetupForStage(Xe.getId(), Element.Xe.Name, Element.Xe.Pos, Element.Xe.AtomMass, Element.Xe.Desc));
        Cs.setOnAction(actionEvent -> SetupForStage(Cs.getId(), Element.Cs.Name, Element.Cs.Pos, Element.Cs.AtomMass, Element.Cs.Desc));
        Ba.setOnAction(actionEvent -> SetupForStage(Ba.getId(), Element.Ba.Name, Element.Ba.Pos, Element.Ba.AtomMass, Element.Ba.Desc));
        Hf.setOnAction(actionEvent -> SetupForStage(Hf.getId(), Element.Hf.Name, Element.Hf.Pos, Element.Hf.AtomMass, Element.Hf.Desc));
        Ta.setOnAction(actionEvent -> SetupForStage(Ta.getId(), Element.Ta.Name, Element.Ta.Pos, Element.Ta.AtomMass, Element.Ta.Desc));
        W.setOnAction(actionEvent -> SetupForStage(W.getId(), Element.W.Name, Element.W.Pos, Element.W.AtomMass, Element.W.Desc));
        Re.setOnAction(actionEvent -> SetupForStage(Re.getId(), Element.Re.Name, Element.Re.Pos, Element.Re.AtomMass, Element.Re.Desc));
        Os.setOnAction(actionEvent -> SetupForStage(Os.getId(), Element.Os.Name, Element.Os.Pos, Element.Os.AtomMass, Element.Os.Desc));
        Ir.setOnAction(actionEvent -> SetupForStage(Ir.getId(), Element.Ir.Name, Element.Ir.Pos, Element.Ir.AtomMass, Element.Ir.Desc));
        Pt.setOnAction(actionEvent -> SetupForStage(Pt.getId(), Element.Pt.Name, Element.Pt.Pos, Element.Pt.AtomMass, Element.Pt.Desc));
        Au.setOnAction(actionEvent -> SetupForStage(Au.getId(), Element.Au.Name, Element.Au.Pos, Element.Au.AtomMass, Element.Au.Desc));
        Hg.setOnAction(actionEvent -> SetupForStage(Hg.getId(), Element.Hg.Name, Element.Hg.Pos, Element.Hg.AtomMass, Element.Hg.Desc));
        Tl.setOnAction(actionEvent -> SetupForStage(Tl.getId(), Element.Tl.Name, Element.Tl.Pos, Element.Tl.AtomMass, Element.Tl.Desc));
        Pb.setOnAction(actionEvent -> SetupForStage(Pb.getId(), Element.Pb.Name, Element.Pb.Pos, Element.Pb.AtomMass, Element.Pb.Desc));
        Bi.setOnAction(actionEvent -> SetupForStage(Bi.getId(), Element.Bi.Name, Element.Bi.Pos, Element.Bi.AtomMass, Element.Bi.Desc));
        Po.setOnAction(actionEvent -> SetupForStage(Po.getId(), Element.Po.Name, Element.Po.Pos, Element.Po.AtomMass, Element.Po.Desc));
        At.setOnAction(actionEvent -> SetupForStage(At.getId(), Element.At.Name, Element.At.Pos, Element.At.AtomMass, Element.At.Desc));
        Rn.setOnAction(actionEvent -> SetupForStage(Rn.getId(), Element.Rn.Name, Element.Rn.Pos, Element.Rn.AtomMass, Element.Rn.Desc));
        Fr.setOnAction(actionEvent -> SetupForStage(Fr.getId(), Element.Fr.Name, Element.Fr.Pos, Element.Fr.AtomMass, Element.Fr.Desc));
        Ra.setOnAction(actionEvent -> SetupForStage(Ra.getId(), Element.Ra.Name, Element.Ra.Pos, Element.Ra.AtomMass, Element.Ra.Desc));
        Rf.setOnAction(actionEvent -> SetupForStage(Rf.getId(), Element.Rf.Name, Element.Rf.Pos, Element.Rf.AtomMass, Element.Rf.Desc));
        Db.setOnAction(actionEvent -> SetupForStage(Db.getId(), Element.Db.Name, Element.Db.Pos, Element.Db.AtomMass, Element.Db.Desc));
        Sg.setOnAction(actionEvent -> SetupForStage(Sg.getId(), Element.Sg.Name, Element.Sg.Pos, Element.Sg.AtomMass, Element.Sg.Desc));
        Bh.setOnAction(actionEvent -> SetupForStage(Bh.getId(), Element.Bh.Name, Element.Bh.Pos, Element.Bh.AtomMass, Element.Bh.Desc));
        Hs.setOnAction(actionEvent -> SetupForStage(Hs.getId(), Element.Hs.Name, Element.Hs.Pos, Element.Hs.AtomMass, Element.Hs.Desc));
        Mt.setOnAction(actionEvent -> SetupForStage(Mt.getId(), Element.Mt.Name, Element.Mt.Pos, Element.Mt.AtomMass, Element.Mt.Desc));
        Ds.setOnAction(actionEvent -> SetupForStage(Ds.getId(), Element.Ds.Name, Element.Ds.Pos, Element.Ds.AtomMass, Element.Ds.Desc));
        Rg.setOnAction(actionEvent -> SetupForStage(Rg.getId(), Element.Rg.Name, Element.Rg.Pos, Element.Rg.AtomMass, Element.Rg.Desc));
        Cn.setOnAction(actionEvent -> SetupForStage(Cn.getId(), Element.Cn.Name, Element.Cn.Pos, Element.Cn.AtomMass, Element.Cn.Desc));
        Nh.setOnAction(actionEvent -> SetupForStage(Nh.getId(), Element.Nh.Name, Element.Nh.Pos, Element.Nh.AtomMass, Element.Nh.Desc));
        Fl.setOnAction(actionEvent -> SetupForStage(Fl.getId(), Element.Fl.Name, Element.Fl.Pos, Element.Fl.AtomMass, Element.Fl.Desc));
        Mc.setOnAction(actionEvent -> SetupForStage(Mc.getId(), Element.Mc.Name, Element.Mc.Pos, Element.Mc.AtomMass, Element.Mc.Desc));
        Lv.setOnAction(actionEvent -> SetupForStage(Lv.getId(), Element.Lv.Name, Element.Lv.Pos, Element.Lv.AtomMass, Element.Lv.Desc));
        Ts.setOnAction(actionEvent -> SetupForStage(Ts.getId(), Element.Ts.Name, Element.Ts.Pos, Element.Ts.AtomMass, Element.Ts.Desc));
        Og.setOnAction(actionEvent -> SetupForStage(Og.getId(), Element.Og.Name, Element.Og.Pos, Element.Og.AtomMass, Element.Og.Desc));
        La.setOnAction(actionEvent -> SetupForStage(La.getId(), Element.La.Name, Element.La.Pos, Element.La.AtomMass, Element.La.Desc));
        Ce.setOnAction(actionEvent -> SetupForStage(Ce.getId(), Element.Ce.Name, Element.Ce.Pos, Element.Ce.AtomMass, Element.Ce.Desc));
        Pr.setOnAction(actionEvent -> SetupForStage(Pr.getId(), Element.Pr.Name, Element.Pr.Pos, Element.Pr.AtomMass, Element.Pr.Desc));
        Nd.setOnAction(actionEvent -> SetupForStage(Nd.getId(), Element.Nd.Name, Element.Nd.Pos, Element.Nd.AtomMass, Element.Nd.Desc));
        Pm.setOnAction(actionEvent -> SetupForStage(Pm.getId(), Element.Pm.Name, Element.Pm.Pos, Element.Pm.AtomMass, Element.Pm.Desc));
        Sm.setOnAction(actionEvent -> SetupForStage(Sm.getId(), Element.Sm.Name, Element.Sm.Pos, Element.Sm.AtomMass, Element.Sm.Desc));
        Eu.setOnAction(actionEvent -> SetupForStage(Eu.getId(), Element.Eu.Name, Element.Eu.Pos, Element.Eu.AtomMass, Element.Eu.Desc));
        Gd.setOnAction(actionEvent -> SetupForStage(Gd.getId(), Element.Gd.Name, Element.Gd.Pos, Element.Gd.AtomMass, Element.Gd.Desc));
        Tb.setOnAction(actionEvent -> SetupForStage(Tb.getId(), Element.Tb.Name, Element.Tb.Pos, Element.Tb.AtomMass, Element.Tb.Desc));
        Dy.setOnAction(actionEvent -> SetupForStage(Dy.getId(), Element.Dy.Name, Element.Dy.Pos, Element.Dy.AtomMass, Element.Dy.Desc));
        Ho.setOnAction(actionEvent -> SetupForStage(Ho.getId(), Element.Ho.Name, Element.Ho.Pos, Element.Ho.AtomMass, Element.Ho.Desc));
        Er.setOnAction(actionEvent -> SetupForStage(Er.getId(), Element.Er.Name, Element.Er.Pos, Element.Er.AtomMass, Element.Er.Desc));
        Tm.setOnAction(actionEvent -> SetupForStage(Tm.getId(), Element.Tm.Name, Element.Tm.Pos, Element.Tm.AtomMass, Element.Tm.Desc));
        Yb.setOnAction(actionEvent -> SetupForStage(Yb.getId(), Element.Yb.Name, Element.Yb.Pos, Element.Yb.AtomMass, Element.Yb.Desc));
        Lu.setOnAction(actionEvent -> SetupForStage(Lu.getId(), Element.Lu.Name, Element.Lu.Pos, Element.Lu.AtomMass, Element.Lu.Desc));
        Ac.setOnAction(actionEvent -> SetupForStage(Ac.getId(), Element.Ac.Name, Element.Ac.Pos, Element.Ac.AtomMass, Element.Ac.Desc));
        Th.setOnAction(actionEvent -> SetupForStage(Th.getId(), Element.Th.Name, Element.Th.Pos, Element.Th.AtomMass, Element.Th.Desc));
        Pa.setOnAction(actionEvent -> SetupForStage(Pa.getId(), Element.Pa.Name, Element.Pa.Pos, Element.Pa.AtomMass, Element.Pa.Desc));
        U.setOnAction(actionEvent -> SetupForStage(U.getId(), Element.U.Name, Element.U.Pos, Element.U.AtomMass, Element.U.Desc));
        Np.setOnAction(actionEvent -> SetupForStage(Np.getId(), Element.Np.Name, Element.Np.Pos, Element.Np.AtomMass, Element.Np.Desc));
        Pu.setOnAction(actionEvent -> SetupForStage(Pu.getId(), Element.Pu.Name, Element.Pu.Pos, Element.Pu.AtomMass, Element.Pu.Desc));
        Am.setOnAction(actionEvent -> SetupForStage(Am.getId(), Element.Am.Name, Element.Am.Pos, Element.Am.AtomMass, Element.Am.Desc));
        Cm.setOnAction(actionEvent -> SetupForStage(Cm.getId(), Element.Cm.Name, Element.Cm.Pos, Element.Cm.AtomMass, Element.Cm.Desc));
        Bk.setOnAction(actionEvent -> SetupForStage(Bk.getId(), Element.Bk.Name, Element.Bk.Pos, Element.Bk.AtomMass, Element.Bk.Desc));
        Cf.setOnAction(actionEvent -> SetupForStage(Cf.getId(), Element.Cf.Name, Element.Cf.Pos, Element.Cf.AtomMass, Element.Cf.Desc));
        Es.setOnAction(actionEvent -> SetupForStage(Es.getId(), Element.Es.Name, Element.Es.Pos, Element.Es.AtomMass, Element.Es.Desc));
        Fm.setOnAction(actionEvent -> SetupForStage(Fm.getId(), Element.Fm.Name, Element.Fm.Pos, Element.Fm.AtomMass, Element.Fm.Desc));
        Md.setOnAction(actionEvent -> SetupForStage(Md.getId(), Element.Md.Name, Element.Md.Pos, Element.Md.AtomMass, Element.Md.Desc));
        No.setOnAction(actionEvent -> SetupForStage(No.getId(), Element.No.Name, Element.No.Pos, Element.No.AtomMass, Element.No.Desc));
        Lr.setOnAction(actionEvent -> SetupForStage(Lr.getId(), Element.Lr.Name, Element.Lr.Pos, Element.Lr.AtomMass, Element.Lr.Desc));
    }

}