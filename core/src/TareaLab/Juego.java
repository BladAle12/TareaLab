package TareaLab;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Juego extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img,imgP,imgPe,img1, img2, img3, img4, img5, img6, img7, img8, img9;
	
	int posx = 10, posy = 1, posy2 = 1;
	
	boolean mov1 = true, mov2= true, mov3= true;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("p1.png");
		imgP = new Texture("Block.png");
		imgPe = new Texture("Block.png");
		img1 = new Texture("mano.png");
		img2 = new Texture("cara.png");
		img3 = new Texture("cloud1.png");
		img4 = new Texture("box.png");
		img5 = new Texture("cactus.png");
		img6 = new Texture("bush.png");
		img7 = new Texture("plant.png");
		img8 = new Texture("p2.png");
		img9 = new Texture("ene.png");
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, posx, 50);
		batch.draw(imgP, 0,0);
		batch.draw(img1, 500,10);
		batch.draw(imgP, 86,0);
		batch.draw(imgP, 172,0);
		batch.draw(imgP, 258,0);
		batch.draw(imgP, 344,0);
		batch.draw(imgP, 430,0);
		batch.draw(imgP, 516,0);
		batch.draw(imgPe, 602,posy);
		batch.draw(img2, posx, posy);
		batch.draw(img3, 100, 350);
		batch.draw(img3, 400, 350);
		batch.draw(img5, 200, 48);
		batch.draw(img6, 100, 48);
		batch.draw(img6, 500, 48);
		batch.draw(img7, 300, 48);
		batch.draw(img4, 150, 150);
		batch.draw(img8, 150,200);
		batch.draw(img9, 100,370);
		batch.end();
		
		
		
		if(posy < 500 && mov1==true){
			posy++;
			}else{
				mov1 = false;
				posy--;
			}
		
		
		
		if (posy2 < 200 && mov2 == true){
			posy2++;
			}
		else{
				mov2 = false;
				posy2--;
			}
		
		if(posy2==1){
				mov2 = true;
		}
		
		if(posx<500 && mov3 == true){
			posx+=1;
			}else{
			posx-=1;
			mov3 = false;
		}
		if(posx == 300){
			mov3 = true;
		}
	}
}
