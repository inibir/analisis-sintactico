/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sintactico.Arbol;

import Visitor.visitor;

/**
 *
 * @author lidier
 */
public class AST_VarDecl_Lista extends AST_VarDecl {

    public AST_VarDecl N_VarDecl;
    public AST_VarDecl extN;

    public AST_VarDecl_Lista() {
    }

    public AST_VarDecl_Lista(AST_VarDecl N_VarDecl, AST_VarDecl extN) {
        this.N_VarDecl = N_VarDecl;
        this.extN = extN;
    }
    public Object visit(visitor v){
        return v.visitVarDecl_Lista(this);
    }




}
