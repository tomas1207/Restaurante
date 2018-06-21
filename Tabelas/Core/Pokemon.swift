//
//  Pokemon.swift
//  Pokemon
//
//  Created by on 09/05/2018.
//  Copyright © 2018 Tomas. All rights reserved.
//

import Foundation
class pokemon{
       let advpokemon:EmenyPokemon = EmenyPokemon()
    var Nome:String
    var Vida,Atk,Def,rng:Int
    let minigame:Minigame = Minigame()
    var exp:Int = 0
    init(Nome:String) {
        self.Nome = Nome
        self.Atk = 0
        self.Def = 0
        self.Vida = 0
        self.rng = 0
        experence()
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
    func Dead(){
        advpokemon.Stausapll()
    }
    func Stausapll() {
        self.Atk = Int(arc4random_uniform(10)+3)
        self.Def = Int(arc4random_uniform(3)+1)
        self.Vida = Int(arc4random_uniform(70)+20)
    }
    
    func batallha() -> String {
     
        
        while self.Vida != 0 || advpokemon.Vida != 0 {
            
            self.rng = Int(arc4random_uniform(10)+1)
            
            if rng > 2 {
                let _tempmini = minigame.Atckmodifer(N: self.Atk)
                if _tempmini != 0 {
                    self.Atk = _tempmini
                    print("Ganhou o minigame")
                }
                        let dngperc = self.Atk / advpokemon.Def + 1
                advpokemon.Vida = advpokemon.Vida - dngperc
            }
            advpokemon.rng = Int(arc4random_uniform(10)+1)
            if advpokemon.rng > 2 {
                let _tempmini2 = minigame.Atckmodifer(N: advpokemon.Atk)
                if _tempmini2 != 0 {
                    advpokemon.Atk = _tempmini2
                      print("O adv ganhou")
                }
                    let dngtome = advpokemon.Atk / self.Def + 1
                self.Vida = self.Vida - dngtome
            }
            sleep(1)
            if advpokemon.Vida <= 0 {
                Dead()
                return "Winner"
              
            }
            if self.Vida <= 0 {
                self.Vida = 0
            }
            if self.advpokemon.Vida <= 0 {
                self.advpokemon.Vida = 0
            }
            return "Next Round Vida adv \(advpokemon.Vida) Vida do meu poke \(self.Vida)"
        }
        if self.Vida <= 0 {
            return "Loser"
        }
            return "-"
        
        }
    
    }

