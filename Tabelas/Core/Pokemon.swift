//
//  Pokemon.swift
//  Pokemon
//
//  Created by Tomas on 09/05/2018.
//  Copyright © 2018 Tomas. All rights reserved.
//

import Foundation
class pokemon{
       let advpokemon:EmenyPokemon = EmenyPokemon()
    var Nome,tipo:String
    var Vida,Atk,Def,rng:Int
    let minigame:Minigame = Minigame()
    var exp:Int = 0
    
    init(Nome:String, tipo:String) {
        self.Nome = Nome
        self.Atk = 0
        self.Def = 0
        self.Vida = 0
        self.rng = 0
        self.tipo = tipo
        experence()
        Stausapll()
    }
    func experence() -> Int {
        if self.exp > 0
        {
            self.exp = self.exp + Int(arc4random_uniform(5)+1)
            return self.exp
        }
        return 0
        
    }
    func appexp(exp:Int) {
        var _tempatkmod = Int(arc4random_uniform(3)+1)
        switch _tempatkmod {
        case 1:
            var _temp = exp % 100
            
            self.Atk = self.Atk * _temp
        case 2:
            var _temp = exp % 100
            
            self.Def = self.Def * _temp
        case 3:
            var _temp = exp % 100
            
            self.Vida = self.Vida * _temp
            
        default:
            self.Vida = self.Vida + 0
        }
        
    }
    func Dead(){
        advpokemon.Stausapll()
    }
    
    
    
    
    func elementos(advpokemon:advpokemon.tipo, dmg:Int) -> String{
        if advpokemon{
            if advpokemon = "Agua" && self.tipo = "Fogo" {
                return "Fraco"
            }
            else
            {
                return "Forte"
            }
            if advpokemon = "Erva" && self.tipo = "Pedra" {
                
            return "Fraco"
            }
            else{
                return "Forte"
                
            }
        }
    }
    
    
    func Stausapll() {
        self.Atk = Int(arc4random_uniform(10)+3)
        self.Def = Int(arc4random_uniform(3)+1)
        self.Vida = Int(arc4random_uniform(70)+20)
    }
}
