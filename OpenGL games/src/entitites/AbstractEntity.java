package entitites;

import java.awt.Rectangle;

public abstract class AbstractEntity implements Entity {
protected double x,y,width,height;
protected Rectangle hitbox=new Rectangle();
	public AbstractEntity(double x,double y,double height,double width) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
	}

	
	@Override
	public void setLocation(double x, double y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void setX(double x) {
		this.x=x;

	}

	@Override
	public void setY(double y) {
	this.y=y;
	}

	@Override
	public void setWidth(double width) {
		this.width=width;

	}

	@Override
	public void setHeight(double height) {
		this.height=height;
	}

	@Override
	public double getX() {
		
		return this.x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public boolean intersects(Entity other) {
		hitbox.setBounds((int)x,(int)y,(int)width,(int)height);
		return hitbox.intersects(other.getX(),other.getY(),other.getWidth(),other.getHeight());
	}

}
