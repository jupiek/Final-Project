public class BuildShip {

    public void carrier(){
	int direction=(int)(2*Math.random());
		
	int size=0;
	if (direction==0){
	    int y=(int)(((finalBoard[0].length)-5)*Math.random());
	    int z=(int)(((finalBoard.length))*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=5;}
	    while (size<5){
		if (finalBoard[y+1][z]==-1){
		    finalBoard[y][z]=5;
		    y++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==5){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length)-5)*Math.random());
		    z=(int)(((finalBoard.length))*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=5;}
		}
	    }
	}
	else{
	    int y=(int)(((finalBoard[0].length))*Math.random());
	    int z=(int)(((finalBoard.length)-5)*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=5;}
	    while (size<5){
		if (finalBoard[y][z+1]==-1){
		    finalBoard[y][z]=5;
		    z++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==5){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length))*Math.random());
		    z=(int)(((finalBoard.length)-5)*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=5;}
		}
	    }
	}
    }

    public void destroyer(){
	int direction=(int)(2*Math.random());
		
	int size=0;
	if (direction==0){
	    int y=(int)(((finalBoard[0].length)-4)*Math.random());
	    int z=(int)(((finalBoard.length))*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=4;}
	    while (size<4){
		if (finalBoard[y+1][z]==-1){
		    finalBoard[y][z]=4;
		    y++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==4){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length)-4)*Math.random());
		    z=(int)(((finalBoard.length))*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=4;}
		}
	    }
	}
	else{
	    int y=(int)(((finalBoard[0].length))*Math.random());
	    int z=(int)(((finalBoard.length)-4)*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=4;}
	    while (size<4){
		if (finalBoard[y][z+1]==-1){
		    finalBoard[y][z]=4;
		    z++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==4){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length))*Math.random());
		    z=(int)(((finalBoard.length)-4)*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=4;}
		}
	    }
	}
    }

    public void cruiser(){
	int direction=(int)(2*Math.random());
		
	int size=0;
	if (direction==0){
	    int y=(int)(((finalBoard[0].length)-4)*Math.random());
	    int z=(int)(((finalBoard.length))*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=6;}
	    while (size<4){
		if (finalBoard[y+1][z]==-1){
		    finalBoard[y][z]=6;
		    y++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==6){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length)-4)*Math.random());
		    z=(int)(((finalBoard.length))*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=6;}
		}
	    }
	}
	else{
	    int y=(int)(((finalBoard[0].length))*Math.random());
	    int z=(int)(((finalBoard.length)-4)*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=6;}
	    while (size<4){
		if (finalBoard[y][z+1]==-1){
		    finalBoard[y][z]=6;
		    z++;
		    size++;
		}
		else{size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==6){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length))*Math.random());
		    z=(int)(((finalBoard.length)-4)*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=6;}
		}
	    }
	}
    }

    public void submarine(){
	int direction=(int)(2*Math.random());
		
	int size=0;
	if (direction==0){
	    int y=(int)(((finalBoard[0].length)-3)*Math.random());
	    int z=(int)(((finalBoard.length))*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=3;}
	    while (size<3){
		if (finalBoard[y+1][z]==-1){
		    finalBoard[y][z]=3;
		    y++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==3){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length)-3)*Math.random());
		    z=(int)(((finalBoard.length))*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=3;}
		}
	    }
	}
	else{
	    int y=(int)(((finalBoard[0].length))*Math.random());
	    int z=(int)(((finalBoard.length)-3)*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=3;}
	    while (size<3){
		if (finalBoard[y][z+1]==-1){
		    finalBoard[y][z]=3;
		    z++;
		    size++;
		}
		else{size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==3){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length))*Math.random());
		    z=(int)(((finalBoard.length)-3)*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=3;}
		}
	    }
	}
    }

    public void patrol(){
	int direction=(int)(2*Math.random());
		
	int size=0;
	if (direction==0){
	    int y=(int)(((finalBoard[0].length)-2)*Math.random());
	    int z=(int)(((finalBoard.length))*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=2;}
	    while (size<2){
		if (finalBoard[y+1][z]==-1){
		    finalBoard[y][z]=2;
		    y++;
		    size++;
		}
		else{
		    size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==2){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length)-2)*Math.random());
		    z=(int)(((finalBoard.length))*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=2;}
		}
	    }
	}
	else{
	    int y=(int)(((finalBoard[0].length))*Math.random());
	    int z=(int)(((finalBoard.length)-2)*Math.random());
	    if (finalBoard[y][z]==-1){
	    	finalBoard[y][z]=2;}
	    while (size<2){
		if (finalBoard[y][z+1]==-1){
		    finalBoard[y][z]=2;
		    z++;
		    size++;
		}
		else{size=0;
		    for (int a=0; a<finalBoard.length;a++){
			for (int b=0; b<finalBoard[0].length;b++){
			    if (finalBoard[a][b]==2){
				finalBoard[a][b]=-1;;
			    }
			}
		    }
		    y=(int)(((finalBoard[0].length))*Math.random());
		    z=(int)(((finalBoard.length)-2)*Math.random());
		    if (finalBoard[y][z]==-1){
			finalBoard[y][z]=2;}
		}
	    }
	}
    }
    
}
