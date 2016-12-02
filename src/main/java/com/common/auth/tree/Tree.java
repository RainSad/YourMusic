package com.common.auth.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import com.core.model.auth.AuthFunction;


public class Tree {
    private List<Node> nodes=new LinkedList<Node>();

    private Node root=null;//根节点

    public Tree(List<AuthFunction> functionsList){
        for(AuthFunction function :functionsList){
        	Node node=new Node(function.getId(),function.getParentId(),function.getName(),"open",function.getSerialNum()
                    ,new NodeAttribute(function.getId(),null==function.getUrl()? "": function.getUrl()));

            if(node.getParentId()==0)
                root=node;
        }
    }

    public List<Node> build(){
        buildTree(root);
        List<Node> results=new ArrayList<Node>();
        results.add(root);
        return results;
    }

    private void buildTree(Node parent){
        Node node=null;
        Iterator<Node> it=nodes.iterator();
        while (it.hasNext()){
            node=it.next();
            if(Objects.equals(node.getParentId(),parent.getId())){
                parent.getChildren().add(node);
            }
            buildTree(node);
        }
    }
}
