/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sintactico.Arbol;

/**
 *
 * @author lidier
 */
public class AST_Exp_TerminalBody_Lista extends AST_Exp_TerminalBody{

    AST_Exp_TerminalBody N_Exp_Terminal;
    AST_Exp_TerminalBody extN;

    public AST_Exp_TerminalBody_Lista() {
    }

    public AST_Exp_TerminalBody_Lista(AST_Exp_TerminalBody N_Exp_Terminal, AST_Exp_TerminalBody extN) {
        this.N_Exp_Terminal = N_Exp_Terminal;
        this.extN = extN;
    }



}
