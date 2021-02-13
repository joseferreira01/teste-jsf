/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.cz.sara2.repositorio;

import br.edu.ifpb.cz.sara2.entidade.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jose
 */
@Named
@RequestScoped
public class UsuarioRepositorio implements Serializable{
    private static List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepositorio() {
    }
    public boolean add(Usuario usuario){
        return usuarios.add(usuario);
    }
    public List<Usuario> index(){
        return Collections.unmodifiableList(usuarios);
    }
    
}
