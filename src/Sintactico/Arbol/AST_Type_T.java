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
public class AST_Type_T extends AST_Type {

    public enum Tipos {TintegerP, Tboolean, Tinteger};
    public Tipos tipo;
    
    public Object visit(visitor v){
        return v.visitType_T(this);
    }
}
