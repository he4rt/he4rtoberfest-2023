const likes = process.argv.slice(2)
switch (likes.length) {
  case 0:
    console.log("Ninguém curtiu isso")
    break

  case 1:
    console.log(`${likes[0]} curtiu isso`)
    break

  case 2:
    console.log(`${likes[0]} e ${likes[1]} curtiram isso`)
    break

  case 3:
    console.log(`${likes[0]}, ${likes[1]} e ${likes[2]} curtiram isso`)
    break

  case 4:
    console.log(`${likes[0]}, ${likes[1]} e outras 2 pessoas curtiram isso`)
    break

  default:
    console.log(`${likes[0]}, ${likes[1]} e outras ${likes.length - 2} pessoas curtiram isso`)
}
