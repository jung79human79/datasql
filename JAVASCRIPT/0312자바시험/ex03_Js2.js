function increase(){
          
    let num = Number(document.getElementById("txt").innerHTML)
    document.getElementById("txt").innerHTML = num + 1;
}
function decrease(){
    let num = Number(document.getElementById("txt").innerHTML);
    if(num <=0){
        document.getElementById("txt").innerHTML = 0;
    }else{
        document.getElementById("txt").innerHTML = num -1;
    }
    
}