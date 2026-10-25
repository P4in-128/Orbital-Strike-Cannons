execute if entity @s[distance=1500..] run return fail
execute positioned ^ ^ ^0.1 unless block ~ ~ ~ air positioned ~ ~70 ~ run function tnt:nukeshot

execute positioned ^ ^ ^0.1 if block ~ ~ ~ air run function tnt:nukeraycast
