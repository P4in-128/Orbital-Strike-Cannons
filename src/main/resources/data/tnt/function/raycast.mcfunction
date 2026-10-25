execute if entity @s[distance=150..] run return fail
execute positioned ^ ^ ^0.1 unless block ~ ~ ~ air run function tnt:stab

execute positioned ^ ^ ^0.1 if block ~ ~ ~ air run function tnt:raycast
