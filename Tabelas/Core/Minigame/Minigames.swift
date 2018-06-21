//
//  Minigames.swift
//  Pokemon
//
//  Created by  on 11/05/2018.
//  Copyright © 2018 Tomas. All rights reserved.
//

import Foundation
class Minigame{
    func Atckmodifer(N:Int) -> Int {
        var rng:Int = Int(arc4random_uniform(10)+1)
        if rng > 8 {
          
            rng = Int(arc4random_uniform(10)+1)
            if N >= rng {
                return N + 10
            }
            
         
        }
           return 0
    }
    func caputer(Numer:Int, Pokemon:EmenyPokemon, mePoke:pokemon) -> String{
        if Numer != 0 {
            let rng:Int = Int(arc4random_uniform(10)+1)
            if rng > Numer {
                return "o pokemon fugio"
            }
            if rng < Numer {
                return "o pokemon fugio"
            }
            if rng == Numer {
                if rng >= 8{
                    Pokemon.cap = true
                    mePoke.Atk = Pokemon.Atk
                    mePoke.Def = Pokemon.Def
                    mePoke.Vida = Pokemon.Vida
                    
                    return "Fui capturado"
                }
                return "o pokemon fugio"
            }
        }
        return "Erro"
    }
}
