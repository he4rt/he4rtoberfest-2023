open System

let getCliArguments () =
    Environment.GetCommandLineArgs()
    |> Seq.skip 2
    |> Seq.head

let parseOrFail (argument: string) =
    match Int32.TryParse argument with
    | false, _ ->
        invalidArg argument "Argumento inválido"
    
    | true, number -> number

let addToList x xs = xs |> List.map (fun ls -> x::ls)

let rec permute curr next res =
    match next with
    | [] -> 
        res @ [curr]
    | [x] ->
        addToList x (permute [] curr (res))
    | x::xs ->
        let s = permute (x::curr) xs res
        addToList x (permute [] (curr@xs) res) @ s

let getPossibleValuesFromPermutation number =
    let initial =
        number.ToString().ToCharArray()
        |> Seq.map string
        |> Seq.toList

    permute [] initial []
    |> List.map (String.concat "" >> Int32.Parse)
    |> List.filter (fun x -> x < number)
    |> List.sortDescending

let proccessResult possibleValues = 
    match possibleValues with
    | [] -> None
    | x -> Some (List.head x)
    
let printResult result =
    match result with
    | Some value -> printfn "%i" value
    | None -> printfn "%A" None

let execute =
    getCliArguments
    >> parseOrFail
    >> getPossibleValuesFromPermutation
    >> proccessResult
    >> printResult

try
    execute()
with
| :? ArgumentException -> eprintfn "Argumento Inválido"
