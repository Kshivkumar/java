class PhotoPirates
{
public static void main(String [] args)
{
	Photo photo=new Photo(7,120,6); 
	photo.setShape("rectangular");
	//photo.setColor(hd);
photo.setMaterial(PhotoFrameMaterial.GLASS);
Color[] hd={Color.BLACK,Color.RED};
photo.setColor(hd);
photo.printAllData();


}	
}