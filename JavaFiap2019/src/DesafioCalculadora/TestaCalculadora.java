p a c k a g e   D e s a f i o C a l c u l a d o r a ; 
 
i m p o r t   j a v a x . s w i n g . J O p t i o n P a n e ; 
 
 p u b l i c   c l a s s   T e s t a C a l c u l a d o r a   { 
 
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   { 
 
 	 	 C a l c u l a d o r a   c b   =   n e w   C a l c u l a d o r a ( ) ; 
 
 	 	 S t r i n g   n 1 ; 
 	 	 S t r i n g   n 2 ; 
 	 	 S t r i n g   o p e r a c a o ; 
 	 	 d o u b l e   r e s u l t a d o ; 
 	 	 i n t   i   =   0 ; 
 	 	 w h i l e   ( i   = =   0 )   { 
 	 	 	 n 1   =   J O p t i o n P a n e . s h o w I n p u t D i a l o g ( " D i g i t e   o   p r i m e i r o   n � m e r o : " ) ; 
 	 	 	 i f   ( ! n 1 . m a t c h e s ( 
 	 	 	 	 	 " ^ [ a - z A - Z �� � � � �� � �a �� �  �� �  � �� � � � �� � � � �� � � �� � � � �� � �S �� � ��� �� � � � �� � � �� �  �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � ] * $ " ) )   { 
 	 	 	 	 o p e r a c a o   =   J O p t i o n P a n e . s h o w I n p u t D i a l o g ( " E n t r e   c o m   a   O p e r a � � o " ) ; 
 	 	 	 	 i f   ( o p e r a c a o . c o n t a i n s ( " * " )   | |   o p e r a c a o . c o n t a i n s ( " / " )   | |   o p e r a c a o . c o n t a i n s ( " + " ) 
 	 	 	 	 	 	 | |   o p e r a c a o . c o n t a i n s ( " - " ) )   { 
 	 	 	 	 	 n 2   =   J O p t i o n P a n e . s h o w I n p u t D i a l o g ( " D i g i t e   o   s e g u n d o   n � m e r o : " ) ; 
 	 	 	 	 	 i f   ( ! n 2 . m a t c h e s ( 
 	 	 	 	 	 	 	 " ^ [ a - z A - Z �� � � � �� � �a �� �  �� �  � �� � � � �� � � � �� � � �� � � � �� � �S �� � ��� �� � � � �� � � �� �  �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � �� � � ] * $ " ) )   { 
 
 	 	 	 	 	 	 i f   ( o p e r a c a o . e q u a l s ( " + " ) )   { 
 	 	 	 	 	 	 	 r e s u l t a d o   =   c b . s o m a r ( D o u b l e . p a r s e D o u b l e ( n 1 ) ,   D o u b l e . p a r s e D o u b l e ( n 2 ) ) ; 
 	 	 	 	 	 	 	 c b . m o s t r a r R e s u l t a d o ( ( f l o a t )   r e s u l t a d o ,   " S o m a " ) ; 
 
 	 	 	 	 	 	 	 i n t   o p t i o n   =   J O p t i o n P a n e . s h o w C o n f i r m D i a l o g ( n u l l ,   " D e s e j a   r e p e t i r   a   O p e r a � � o " ,   " A v i s o " , 
 	 	 	 	 	 	 	 	 	 J O p t i o n P a n e . Y E S _ N O _ O P T I O N ) ; 
 
 	 	 	 	 	 	 	 i f   ( o p t i o n   = =   0 )   { 
 	 	 	 	 	 	 	 	 i   =   0 ; 
 	 	 	 	 	 	 	 }   e l s e   { 
 	 	 	 	 	 	 	 	 i   =   1 ; 
 	 	 	 	 	 	 	 } 
 	 	 	 	 	 	 }   e l s e   i f   ( o p e r a c a o . e q u a l s ( " - " ) )   { 
 	 	 	 	 	 	 	 r e s u l t a d o   =   c b . s u b t r a i r ( D o u b l e . p a r s e D o u b l e ( n 1 ) ,   D o u b l e . p a r s e D o u b l e ( n 2 ) ) ; 
 	 	 	 	 	 	 	 c b . m o s t r a r R e s u l t a d o ( ( f l o a t )   r e s u l t a d o ,   " S u b t r a � � o " ) ; 
 	 	 	 	 	 	 	 i n t   o p t i o n   =   J O p t i o n P a n e . s h o w C o n f i r m D i a l o g ( n u l l ,   " D e s e j a   r e p e t i r   a   O p e r a � � o " ,   " A v i s o " , 
 	 	 	 	 	 	 	 	 	 J O p t i o n P a n e . Y E S _ N O _ O P T I O N ) ; 
 
 	 	 	 	 	 	 	 i f   ( o p t i o n   = =   0 )   { 
 	 	 	 	 	 	 	 	 i   =   0 ; 
 	 	 	 	 	 	 	 }   e l s e   { 
 	 	 	 	 	 	 	 	 i   =   1 ; 
 	 	 	 	 	 	 	 } 
 	 	 	 	 	 	 }   e l s e   i f   ( o p e r a c a o . e q u a l s ( " * " ) )   { 
 	 	 	 	 	 	 	 r e s u l t a d o   =   c b . m u l t i p l i c a r ( D o u b l e . p a r s e D o u b l e ( n 1 ) ,   D o u b l e . p a r s e D o u b l e ( n 2 ) ) ; 
 	 	 	 	 	 	 	 c b . m o s t r a r R e s u l t a d o ( ( f l o a t )   r e s u l t a d o ,   " M u l t i p l i c a � � o " ) ; 
 	 	 	 	 	 	 	 i n t   o p t i o n   =   J O p t i o n P a n e . s h o w C o n f i r m D i a l o g ( n u l l ,   " D e s e j a   r e p e t i r   a   O p e r a � � o " ,   " A v i s o " , 
 	 	 	 	 	 	 	 	 	 J O p t i o n P a n e . Y E S _ N O _ O P T I O N ) ; 
 
 	 	 	 	 	 	 	 i f   ( o p t i o n   = =   0 )   { 
 	 	 	 	 	 	 	 	 i   =   0 ; 
 	 	 	 	 	 	 	 }   e l s e   { 
 	 	 	 	 	 	 	 	 i   =   1 ; 
 	 	 	 	 	 	 	 } 
 	 	 	 	 	 	 } 
 
 	 	 	 	 	 	 e l s e   { 
 	 	 	 	 	 	 	 r e s u l t a d o   =   c b . d i v i d i r ( D o u b l e . p a r s e D o u b l e ( n 1 ) ,   D o u b l e . p a r s e D o u b l e ( n 2 ) ) ; 
 	 	 	 	 	 	 	 c b . m o s t r a r R e s u l t a d o ( ( f l o a t )   r e s u l t a d o ,   " D i v i s � o " ) ; 
 	 	 	 	 	 	 	 i n t   o p t i o n   =   J O p t i o n P a n e . s h o w C o n f i r m D i a l o g ( n u l l ,   " D e s e j a   r e p e t i r   a   O p e r a � � o " ,   " A v i s o " , 
 	 	 	 	 	 	 	 	 	 J O p t i o n P a n e . Y E S _ N O _ O P T I O N ) ; 
 
 	 	 	 	 	 	 	 i f   ( o p t i o n   = =   0 )   { 
 	 	 	 	 	 	 	 	 i   =   0 ; 
 	 	 	 	 	 	 	 }   e l s e   { 
 	 	 	 	 	 	 	 	 i   =   1 ; 
 	 	 	 	 	 	 	 } 
 
 	 	 	 	 	 	 } 
 	 	 	 	 	 }   e l s e   { 
 	 	 	 	 	 	 J O p t i o n P a n e . s h o w M e s s a g e D i a l o g ( n u l l ,   " I n f o r m e   a p e n a s   n � m e r o s " ,   " E r r o " , 
 	 	 	 	 	 	 	 	 J O p t i o n P a n e . E R R O R _ M E S S A G E ) ; 
 	 	 	 	 	 } 
 
 	 	 	 	 }   e l s e   { 
 	 	 	 	 	 J O p t i o n P a n e . s h o w M e s s a g e D i a l o g ( n u l l ,   " I n f o r m e   u m a   o p e r a � � o   v � l i d a ! " ,   " E r r o " , 
 	 	 	 	 	 	 	 J O p t i o n P a n e . E R R O R _ M E S S A G E ) ; 
 	 	 	 	 } 
 	 	 	 }   e l s e   { 
 	 	 	 	 J O p t i o n P a n e . s h o w M e s s a g e D i a l o g ( n u l l ,   " I n f o r m e   a p e n a s   n � m e r o s " ,   " E r r o " ,   J O p t i o n P a n e . E R R O R _ M E S S A G E ) ; 
 	 	 	 } 
 	 	 } 
 	 } 
 } 
