//
//  EmenyPokemon.swift
//  Pokemon
//
//  Created by Tomas on 10/05/2018.
//  Copyright © 2018 Tomas. All rights reserved.
//

import Foundation

class EmenyPokemon{
    var nome: String = "Enemy"
    var Vida,Atk,Def,rng:Int
    var cap:Bool = false
    var exp:Int = 0
    init() {
        self.Vida = 0
        self.Atk = 0
        self.Def = 0
        self.rng = 0
        Stausapll()
    }
    func experence() -> Int {
        if self.exp >= 0
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
    func Stausapll() {
        self.Atk = Int(arc4random_uniform(6)+1)
        self.Def = Int(arc4random_uniform(3)+1)
        self.Vida = Int(arc4random_uniform(70)+20)
    }
    func cap2() -> String {
        
        return "Cenas"
    }
    
    
}
